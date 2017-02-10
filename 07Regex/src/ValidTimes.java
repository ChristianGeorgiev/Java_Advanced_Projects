import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidTimes {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("^[0-9]{2}:[0-9]{2}:[0-9]{2} (A|P)M$");
        String inputLine = console.readLine();
        while (!"END".equals(inputLine)){
            Matcher matcher = pattern.matcher(inputLine);
            if (matcher.find()){
                int hours = Integer.valueOf(matcher.group().substring(0,2));
                int minutes = Integer.valueOf(matcher.group().substring(3,5));
                int seconds = Integer.valueOf(matcher.group().substring(6,8));

                if (hours<=12 && hours > 0 && minutes <= 59 && seconds <= 59) {
                    System.out.println("valid");
                }else {
                    System.out.println("invalid");
                }
            }else {
                System.out.println("invalid");
            }

            inputLine = console.readLine();
        }
    }
}
