import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("\\s(([a-z]+(-|_|\\.)+[a-z]+@)|((\\s|)[a-z]+@))\\w+(-|\\.|)(\\w+|)\\.(\\w+|)(\\.|)\\w+");

        String input = " " + console.readLine();

        while (!"end".equals(input)) {
            Matcher matcher = pattern.matcher(input);
                while (matcher.find()){
                    System.out.println(matcher.group().trim());
                }
            input = console.readLine();
        }

    }
}
