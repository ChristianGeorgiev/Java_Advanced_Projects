import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoyalFlush {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(console.readLine());
        Pattern pattern = Pattern.compile("(\\d+|[A-Z])[a-z]");
        StringBuilder cards = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String line = console.readLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                cards.append(matcher.group());
            }
        }

        findRoyalFlush(cards);

    }
    private static void findRoyalFlush(StringBuilder cards) {

    }


//    private static void findRoyalFlush(StringBuilder cards) {
//        String spadesFlush = "10sJsQsKsAs";
//        String heartsFlush = "10hJhQhKhAh";
//        String clubsFlush = "10cJcQcKcAc";
//        String diamondsFlush = "10dJdQdKdAd";
//        String[] suits = {"s", "h", "c", "d"};
//        int flushes = 0;
//        for (String suit : suits) {
//
//            Pattern pattern = Pattern.compile("([\\d]{2}|[A-Z])"+ suit);
//            Matcher matcher = pattern.matcher(cards);
//            StringBuilder temp = new StringBuilder();
//            int counter = 0;
//            while (matcher.find()) {
//                    temp.append(matcher.group());
//
//                if (temp.length() == spadesFlush.length()) {
//                    if (temp.toString().equals(spadesFlush)) {
//                        System.out.println("Royal Flush Found - Spades");
//                        flushes++;
//                    } else if (temp.toString().equals(heartsFlush)) {
//                        System.out.println("Royal Flush Found - Hearts");
//                        flushes++;
//                    } else if (temp.toString().equals(clubsFlush)) {
//                        System.out.println("Royal Flush Found - Clubs");
//                        flushes++;
//                    } else if (temp.toString().equals(diamondsFlush)) {
//                        System.out.println("Royal Flush Found - Diamonds");
//                        flushes++;
//                    }
//                    temp = new StringBuilder();
//                }
//            }
//
//        }
//        System.out.println("Royal's Royal Flushes - " + flushes + ".");
//
//        }
    }

