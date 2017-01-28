import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by christian on 20.01.17.
 */
public class CalculateSequenceWithQueue {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Long n = console.nextLong();
        ArrayDeque<Long> sequence = new ArrayDeque<>();
        sequence.add(n);

        for (int i = 0; i < 50; i++) {
            long currentElement = sequence.remove();
            System.out.printf("%d ", currentElement);

            long s2 = currentElement+1;
            long s3 = 2*currentElement+1;
            long s4 = currentElement+2;

            sequence.add(s2);
            sequence.add(s3);
            sequence.add(s4);
        }
    }
}
