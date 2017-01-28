import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        ArrayDeque<Integer> maxElements = new ArrayDeque<>();
        maxElements.push(Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            String[] command = console.nextLine().split(" ");

            if (command[0].equals("1")){
                stack.push(Integer.parseInt(command[1]));
                if (stack.peek()>maxElements.peek()){
                    maxElements.push(stack.peek());
                }

            }else if (command[0].equals("2")){
                int removedElement = stack.pop();
                if (removedElement == maxElements.peek()){
                    maxElements.pop();
                }
            }else{
                System.out.println(maxElements.peek());
            }
        }
    }


//    private static ArrayDeque<Integer> popElement(ArrayDeque<Integer> stack) {
//        stack.pop();
//        return stack;
//    }
//
//    private static ArrayDeque<Integer> pushElement(ArrayDeque<Integer> stack, int element) {
//        stack.push(element);
//        return stack;
//    }
}
