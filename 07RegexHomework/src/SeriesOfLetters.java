import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SeriesOfLetters {
    public static void main(String[] args) throws IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String line = console.readLine();
        Pattern pattern = Pattern.compile("([A-z]|[a-z])\\1+");
        Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                String letter = String.valueOf(matcher.group().charAt(0));
                line = line.replaceFirst(matcher.group(), letter);
            }
        System.out.println(line);

    }
}
