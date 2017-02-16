import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JediCodeX {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(console.readLine());
        List<String> names = new ArrayList<>();
        List<String> messages = new ArrayList<>();
        StringBuilder lines = new StringBuilder();

        for (int i = 0; i < n; i++) {
            lines.append(console.readLine());
        }
        String namePatternStr = console.readLine();
        String messagePatternStr = console.readLine();
        String[] indexes = console.readLine().split("\\s+");

        int nameLength = namePatternStr.length();
        int messageLength = messagePatternStr.length();

        Pattern namePattern = Pattern.compile(namePatternStr + "([A-Za-z]+)");
        Pattern messagePattern = Pattern.compile(messagePatternStr + "([A-Za-z0-9]+)");

        Matcher nameMatcher = namePattern.matcher(lines);
        Matcher messageMatcher = messagePattern.matcher(lines);

        while (nameMatcher.find()){
            if (nameMatcher.group(1).length() == nameLength){
                names.add(nameMatcher.group(1));
            }
        }
        while (messageMatcher.find()){
            if (messageMatcher.group(1).length() == messageLength){
                messages.add(messageMatcher.group(1));
            }
        }
//        System.out.println(names.toString());
//        System.out.println(messages.toString());

        for (int i = 0; i < indexes.length; i++) {
            int currentIndex = Integer.parseInt(indexes[i]) - 1;

            if (currentIndex < messages.size() && i < names.size()){
                System.out.println(names.get(i) + " - " + messages.get(currentIndex));
            }
        }
    }
}
