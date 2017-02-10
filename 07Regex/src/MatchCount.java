import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchCount {
    public static void main(String[] args) throws IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String input = console.readLine();
        String text = console.readLine();
        Pattern pattern = Pattern.compile(input);
        Matcher matcher = pattern.matcher(text);

        int counter = 0;
        while (matcher.find()){
            counter++;
        }
        System.out.println(counter);
    }
}
