import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceIExtractor {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String keyword = console.readLine();
        Pattern pattern = Pattern.compile("\\w(\\w|\\s)+\\s"+keyword+"\\s([a-z]|\\s|)+[\\.\\!\\?]");
        String text = console.readLine();

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(matcher.group().trim());
        }
    }
}
