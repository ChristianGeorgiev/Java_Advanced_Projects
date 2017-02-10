import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractTags {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("<.+?>", Pattern.MULTILINE);

        String htmlCode = console.readLine();
        ArrayList<String> matches = new ArrayList<>();
        while (!"END".equals(htmlCode)){
            Matcher matcher = pattern.matcher(htmlCode);
                while (matcher.find()){
                    matches.add(matcher.group());
                }

                htmlCode = console.readLine();
        }

        if (matches.size()>0){
            for (String match : matches) {
                System.out.println(match);
            }
        }
    }
}
