import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String line = console.readLine();
        Pattern pattern = Pattern.compile("^\\+359( |-)\\d\\1\\d{3}\\1\\d{4}$");

        while (!"end".equals(line)){
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()){
                System.out.println(matcher.group());
            }
            line = console.readLine();
        }

    }
}
