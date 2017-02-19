import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ascent {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        Pattern pattern = Pattern.compile("(,|_)[A-Za-z]+[0-9]{1}");
        String line = console.readLine();
        LinkedHashMap<String,String> matchedStrings = new LinkedHashMap<>();
        StringBuilder allLines = new StringBuilder();
        while (!"Ascend".equals(line)){
            allLines.append(line).append(String.format("%n"));
            line = console.readLine();
        }

        Matcher matcher = pattern.matcher(allLines);

        while (matcher.find()){
            if (matchedStrings.containsKey(matcher.group())){
                allLines = new StringBuilder(allLines.toString().replaceAll(matcher.group()
                        , matchedStrings.get(matcher.group())));
            }else {
                matchedStrings.putIfAbsent(matcher.group(), decryptMessage(matcher.group()));
                allLines = new StringBuilder(allLines.toString()
                        .replaceAll(matcher.group(), decryptMessage(matcher.group())));
            }

            matcher = pattern.matcher(allLines);
        }

        System.out.println(allLines);
    }

    private static String decryptMessage(String match) {
        StringBuilder sb = new StringBuilder(match.substring(1, match.length()-1));
        char firstChar = match.charAt(0);
        int number = Integer.valueOf(match.substring(match.length()-1));

        if (firstChar == ',') {
            for (int i = 0; i < sb.length(); i++) {
                sb.setCharAt(i, (char)(sb.charAt(i)+number));
            }
        }else if (firstChar == '_'){
            for (int i = 0; i < sb.length(); i++) {
                sb.setCharAt(i, (char)(sb.charAt(i)-number));
            }
        }
        return sb.toString();
    }
}
