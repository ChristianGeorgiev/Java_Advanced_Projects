import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by christian on 19.01.17.
 */
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] inputStr = console.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < inputStr.length; i++) {
            stack.add(String.valueOf(inputStr[i]));
        }

        while (stack.size() > 1){
            int first = Integer.parseInt(stack.pop());
            String operator = stack.pop();
            int second = Integer.parseInt(stack.pop());

            if (operator.equals("+")){
                stack.push(String.valueOf(first+second));
            }else{
                stack.push(String.valueOf(first-second));
            }
        }

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
