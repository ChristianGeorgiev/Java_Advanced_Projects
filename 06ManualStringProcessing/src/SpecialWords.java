import java.util.HashMap;
import java.util.Scanner;

public class SpecialWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] wordsStr = console.nextLine().split("\\s+");

        HashMap<String,Integer> words = new HashMap<>();

        for (int i = 0; i < wordsStr.length; i++) {
            words.put(wordsStr[i], 0);
        }

        String[] text = console.nextLine().split("\\s+");
        for (int i = 0; i < text.length; i++) {
            if (words.containsKey(text[i])){
                words.put(text[i], words.get(text[i]) + 1);
            }
        }

        for (String word : words.keySet()) {
            System.out.println(word + " - " + words.get(word));
        }
    }
}
