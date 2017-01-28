import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

/**
 * Created by christian on 23.01.17.
 */
public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        Deque<Long> sequence = new ArrayDeque<>();



    }

    private static long getFibonacci(int n){
        ArrayDeque<Long> fibonacci = new ArrayDeque<>();
        fibonacci.push(0L);
        fibonacci.push(1L);
        for (int i = 0; i < n; i++) {
            long secondElement = fibonacci.pop();
            long firstElement = fibonacci.pop();
            long currentE = secondElement + firstElement;

            fibonacci.push(secondElement);
            fibonacci.push(currentE);
        }
        return fibonacci.peek();
    }
}
