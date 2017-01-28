import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by christian on 24.01.17.
 */
public class CountSameValuesInArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(" ");
        HashMap<String, Integer> counter = new HashMap<>();

        for (int i = 0; i < input.length; i++) {
            counter.put(input[i], 0);
        }

        for (int i = 0; i < input.length; i++) {
            if (counter.containsKey(input[i])){
                counter.put(input[i], counter.get(input[i])+1);
            }
        }

        for (String number : counter.keySet()) {
            System.out.println(number + " - " + counter.get(number) + " times");
        }
    }
}
