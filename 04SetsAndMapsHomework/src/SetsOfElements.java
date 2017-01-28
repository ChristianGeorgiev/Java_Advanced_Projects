import java.util.LinkedHashSet;
import java.util.Scanner;


public class SetsOfElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split("\\s+");
        int firstNumbers = Integer.parseInt(input[0]);
        int secondNumbers = Integer.parseInt(input[1]);

        LinkedHashSet<Integer> firstSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> secondSet = new LinkedHashSet<>();
        LinkedHashSet<Integer> repeating = new LinkedHashSet<>();

        for (int i = 0; i < firstNumbers; i++) {
            firstSet.add(Integer.parseInt(console.nextLine()));
        }
        for (int i = 0; i < secondNumbers; i++) {
            secondSet.add(Integer.parseInt(console.nextLine()));
        }


        for (Integer num : firstSet) {
            if (secondSet.contains(num)){
                repeating.add(num);
            }
        }

        for (Integer num : repeating) {
            System.out.print(num + " ");
        }
    }
}
