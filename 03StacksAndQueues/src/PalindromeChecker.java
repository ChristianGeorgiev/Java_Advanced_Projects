import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by christian on 20.01.17.
 */
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        System.out.println(isPalindrome(input));
    }

    static boolean isPalindrome(String input){
        ArrayDeque<Character> queue = new ArrayDeque<>();
        for (int i = 0; i < input.toCharArray().length; i++) {
            queue.add(input.toCharArray()[i]);
        }

        while (queue.size()>1){
            char first = queue.pop();
            char last = queue.removeLast();
            if (first!=last){
                return false;
            }
        }
        return true;
    }
}
