import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] children = console.nextLine().split(" ");
        int n = Integer.parseInt(console.nextLine());
        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        int cycle = 1;
        while (queue.size() > 1) {
            for (int i = 1; i < n; i++){
                String firstChild = queue.poll();
                queue.offer(firstChild);
            }
            if (isPrime(cycle)) {
                System.out.println("Prime " + queue.peek());
            }else{
                System.out.println("Removed " + queue.poll());
            }
            cycle++;
//            queue.poll();
        }
        System.out.println("Last is " + queue.poll());
    }


    private static boolean isPrime(int num) {
        if (num <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
