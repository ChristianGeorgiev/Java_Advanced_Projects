import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFilter {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] banWords = console.readLine().split(", ");
        String textStr = console.readLine();
        StringBuilder text = new StringBuilder(textStr);

        for (String banWord : banWords) {
            for (int j = 0; j < text.length() - banWord.length(); j++) {
                if (text.substring(j, j + banWord.length()).equals(banWord)){
                    String stars = "";
                    for (int i = 0; i < banWord.length(); i++) {
                        stars += "*";
                    }

                    text.replace(j, j + banWord.length(), stars);
                }
            }
        }

        System.out.println(text);
    }
}
