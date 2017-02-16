import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JediDreams {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        //method names - static [\w\s]+[A-za-z]+
        //method calls - (\.[\w\s]+[A-za-z]+|([A-Z][A-Za-z]+)\(.+\);)

        int n = Integer.valueOf(console.readLine());
        Pattern methodNamesPattern = Pattern.compile("static [\\w\\s]+[A-za-z]+");
        Pattern methodCallsPattern = Pattern.compile("(\\.[\\w\\s]+[A-za-z]+|([A-Z][A-Za-z]+)\\(.+\\);)");
        LinkedHashMap<String, TreeSet<String>> result = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String line = console.readLine();
            Matcher methodNamesMatcher = methodNamesPattern.matcher(line);
            Matcher methodCallsMatcher = methodCallsPattern.matcher(line);
        }

        for (String s : result.keySet()) {
            System.out.println(s + " -> " + result.get(s).toString());
        }
    }
}
