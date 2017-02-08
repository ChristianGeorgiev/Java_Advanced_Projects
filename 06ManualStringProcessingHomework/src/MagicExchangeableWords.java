import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MagicExchangeableWords {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = console.readLine().split("\\s+");
        String firstWord = strings[0];
        String secondWord = strings[1];

        System.out.println(isExchangeable(firstWord, secondWord));
    }

    private static boolean isExchangeable(String firstWord, String secondWord) {
        HashMap<Character,Character> charMap = new HashMap<>();
        String reminder;

        if (firstWord.length()>secondWord.length()){
            reminder = firstWord.substring(secondWord.length());
            for (int i = 0; i < secondWord.length(); i++) {
                if (!charMap.containsKey(secondWord.charAt(i)) && !charMap.containsValue(firstWord.charAt(i))){
                    charMap.put(secondWord.charAt(i), firstWord.charAt(i));
                }else {
                    if (charMap.containsKey(secondWord.charAt(i))
                            && charMap.get(secondWord.charAt(i)) == firstWord.charAt(i)){
                        continue;
                    }else {
                        return false;
                    }
                }
            }

            for (int i = 0; i < reminder.length(); i++) {
                if (!charMap.containsValue(reminder.charAt(i))){
                    return false;
                }
            }
            return true;
        }else if (firstWord.length()<secondWord.length()){
            reminder = secondWord.substring(firstWord.length());
            for (int i = 0; i < firstWord.length(); i++) {
                if (!charMap.containsKey(firstWord.charAt(i)) && !charMap.containsValue(secondWord.charAt(i))){
                    charMap.put(firstWord.charAt(i), secondWord.charAt(i));
                }else {
                    if (charMap.containsKey(firstWord.charAt(i))
                            && charMap.get(firstWord.charAt(i)) == secondWord.charAt(i)){
                        continue;
                    }else {
                        return false;
                    }
                }
            }
            for (int i = 0; i < reminder.length(); i++) {
                if (!charMap.containsValue(reminder.charAt(i))){
                    return false;
                }
            }
            return true;
        }else {
            for (int i = 0; i < firstWord.length(); i++) {
                if (!charMap.containsKey(firstWord.charAt(i)) && !charMap.containsValue(secondWord.charAt(i))){
                    charMap.put(firstWord.charAt(i), secondWord.charAt(i));
                }else {
                    if (charMap.containsKey(firstWord.charAt(i))
                            && charMap.get(firstWord.charAt(i)) == secondWord.charAt(i)){
                            continue;
                    }else{
                        return false;
                    }
                }
            }
            return true;
        }
    }


}
