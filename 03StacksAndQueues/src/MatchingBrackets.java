import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by christian on 19.01.17.
 */
public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String inputStr = console.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);
            if (c == '('){
                stack.push(i);
            }else if (c == ')'){
                int startIndex = stack.pop();
                String sub = inputStr.substring(startIndex, i+1);
                System.out.println(sub);
            }
        }
    }
}
