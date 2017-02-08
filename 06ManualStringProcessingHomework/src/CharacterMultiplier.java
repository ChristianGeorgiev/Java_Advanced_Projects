import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterMultiplier {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = console.readLine().split("\\s+");

        if (strings[0].length() != strings[1].length()){
            if (strings[0].length() > strings[1].length()){
                String reminder = strings[0].substring(strings[1].length());
                int totalSum = 0;
                for (int i = 0; i < strings[1].length(); i++) {
                    totalSum += strings[0].charAt(i) * strings[1].charAt(i);
                }
                int reminderSum = 0;
                for (int i = 0; i < reminder.length(); i++) {
                    reminderSum += reminder.charAt(i);
                }

                totalSum += reminderSum;
                System.out.println(totalSum);
            }else {
                String reminder = strings[1].substring(strings[0].length());
                int totalSum = 0;
                for (int i = 0; i < strings[0].length(); i++) {
                    totalSum += strings[0].charAt(i) * strings[1].charAt(i);
                }
                int reminderSum = 0;
                for (int i = 0; i < reminder.length(); i++) {
                    reminderSum += reminder.charAt(i);
                }

                totalSum += reminderSum;
                System.out.println(totalSum);
            }

        }else {
            int totalSum = 0;
            for (int i = 0; i < strings[0].length(); i++) {
                totalSum += strings[0].charAt(i) * strings[1].charAt(i);
            }
            System.out.println(totalSum);
        }
    }
}
