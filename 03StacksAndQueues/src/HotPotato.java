import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;


public class HotPotato {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] children = console.nextLine().split(" ");
        int n = Integer.parseInt(console.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();

        Collections.addAll(queue, children);

        while (queue.size() > 1) {
            for (int i = 1; i < n; i++)
                queue.offer(queue.poll());

            System.out.println("Removed " + queue.poll());
        }

        System.out.println("Last is " + queue.poll());
    }
}
