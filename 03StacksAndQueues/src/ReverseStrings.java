import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        ArrayDeque<String> reversed = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            reversed.push(String.valueOf(c));
        }

        while (!reversed.isEmpty()){
            System.out.print(reversed.pop());
        }
        System.out.println();
    }
}
