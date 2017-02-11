import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceATag {
    public static void main(String[] args) throws IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("(<a (href=(\"|').+(\"|'))>)|(<\\/a>)");

        String line = console.readLine();
        while (!"END".equals(line)){
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                if (matcher.group().equals("</a>")){
                    line = line.replaceFirst(matcher.group(), "[/URL]");
                }else {
                    line = line.replaceFirst(matcher.group(), String.format("[URL %s]", matcher.group(2)));
                }
            }
            System.out.println(line);
            line = console.readLine();
        }

    }
}
