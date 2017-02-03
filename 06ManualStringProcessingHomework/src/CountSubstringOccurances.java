import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountSubstringOccurances {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String text = console.readLine().toLowerCase();
        String wantedStr = console.readLine().toLowerCase();
        int occuranceCount = 0;

        int wantedStrLength = wantedStr.length();

        for (int i = 0; i <= text.length()-wantedStrLength; i++) {
            if (text.substring(i, i+wantedStrLength).equals(wantedStr)){
                occuranceCount++;
            }
        }

        System.out.println(occuranceCount);


    }
}
