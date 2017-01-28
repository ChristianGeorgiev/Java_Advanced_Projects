import java.util.*;

public class Voina {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] firstPlayerStr = console.nextLine().split(" ");
        String[] secondPlayerStr = console.nextLine().split(" ");
        LinkedHashSet<Integer> firstPlayerNumbers = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondPlayerNumbers = new LinkedHashSet<>();

        for (int i = 0; i < firstPlayerStr.length; i++) {
            firstPlayerNumbers.add(Integer.valueOf(firstPlayerStr[i]));
        }
        for (int i = 0; i < secondPlayerStr.length; i++) {
            secondPlayerNumbers.add(Integer.valueOf(secondPlayerStr[i]));
        }


        for (int i = 0; i < 50; i++) {
            int firstNumber = firstPlayerNumbers.iterator().next();
            int secondNumber = secondPlayerNumbers.iterator().next();
            firstPlayerNumbers.remove(firstNumber);
            secondPlayerNumbers.remove(secondNumber);

            if (firstNumber>secondNumber){
                firstPlayerNumbers.add(firstNumber);
                firstPlayerNumbers.add(secondNumber);
            }else if(secondNumber>firstNumber){
                secondPlayerNumbers.add(firstNumber);
                secondPlayerNumbers.add(secondNumber);
            }else {
                continue;
            }
        }

        if (firstPlayerNumbers.size() > secondPlayerNumbers.size()){
            System.out.println("First player win!");
        }else if(secondPlayerNumbers.size() > firstPlayerNumbers.size()){
            System.out.println("Second player win!");
        }else {
            System.out.println("Draw");
        }
    }
}
