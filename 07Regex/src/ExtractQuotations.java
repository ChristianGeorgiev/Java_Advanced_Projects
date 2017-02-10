import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractQuotations {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String line = console.readLine();
        Pattern pattern = Pattern.compile("(\"|').*?(\\1)");
        Matcher matcher = pattern.matcher(line);

        while (matcher.find()){
            StringBuilder sb = new StringBuilder(matcher.group());

            sb.deleteCharAt(0);
            sb.deleteCharAt(sb.length()-1);

            System.out.println(sb);
        }
    }
}
