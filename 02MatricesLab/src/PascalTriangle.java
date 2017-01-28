import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by christian on 17.01.17.
 */
public class PascalTriangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int maxRows = console.nextInt();
        int r, num;
        for (int i = 0; i < maxRows; i++) {
            num = 1;
            r = i + 1;

            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
