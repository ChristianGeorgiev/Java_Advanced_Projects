import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int rows = Integer.parseInt(console.nextLine());
        TreeSet<String> elements = new TreeSet<>();

        for (int i = 0; i < rows; i++) {
            String[] input = console.nextLine().split("\\s+");
            for (int j = 0; j < input.length; j++) {
                elements.add(input[j]);
            }
        }

        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
