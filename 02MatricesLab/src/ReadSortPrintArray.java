import java.util.Arrays;
import java.util.Scanner;
public class ReadSortPrintArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int length = Integer.parseInt(console.nextLine());
        String[] names = new String[length];
        for (int i = 0; i < names.length; i++) {
            names[i] = console.nextLine();
        }

        Arrays.sort(names);

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
