import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by christian on 20.01.17.
 */
public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int pushCount = console.nextInt();
        int popCount = console.nextInt();
        int elementToCheck = console.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < pushCount; i++) {
            stack.add(Integer.parseInt(console.next()));
        }

        for (int i = 0; i < popCount; i++) {
            stack.remove();
        }

        boolean match = false;
        int smallestNum = Integer.MAX_VALUE;
        for (int number:stack) {
            if (number==elementToCheck){
                match=true;
            }else if(number<=smallestNum){
                smallestNum=number;
            }
        }
        if (match){
            System.out.println(match);
        }else if (smallestNum!=Integer.MAX_VALUE){
            System.out.println(smallestNum);
        }else {
            System.out.println("0");
        }
    }
}
