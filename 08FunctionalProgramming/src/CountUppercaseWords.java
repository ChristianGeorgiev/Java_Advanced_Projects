import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.BooleanSupplier;
import java.util.function.Function;

public class CountUppercaseWords {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] text = console.readLine().split("\\s+");
        ArrayList<String> upperCaseWords = new ArrayList<>();

        Function<String,Boolean> checkUpper = s-> s.charAt(0) == s.toUpperCase().charAt(0);

        for (int i = 0; i < text.length; i++) {
            if(checkUpper.apply(text[i])){
                upperCaseWords.add(text[i]);
            }
        }

        System.out.println(upperCaseWords.size());
        for (String upperCaseWord : upperCaseWords) {
            System.out.println(upperCaseWord);
        }
    }
}
