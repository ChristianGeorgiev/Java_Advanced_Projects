import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UnicodeCharacters {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String input = console.readLine();
        for (int i = 0; i < input.length(); i++) {
            System.out.print( "\\u" + Integer.toHexString(input.charAt(i) | 0x10000).substring(1) );
        }
        System.out.println();
    }
}
