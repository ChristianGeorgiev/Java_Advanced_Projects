import java.util.ArrayDeque;
import java.util.Scanner;


public class StackFibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

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
        System.out.println(fibonacci.peek());
    }
}
