import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUsernames {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^[A-Za-z0-9_-]{3,16}$");

        String input = console.readLine();
        while (!"END".equals(input)){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                System.out.println("valid");
            }else {
                System.out.println("invalid");
            }
            input = console.readLine();
        }
    }
}
