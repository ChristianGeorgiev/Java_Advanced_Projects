import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by christian on 20.01.17.
 */
public class ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        ArrayDeque<String> reversed = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            reversed.push(input[i]);
        }
        while (reversed.size()>0){
            System.out.print(reversed.pop() + " ");
        }
    }
}
