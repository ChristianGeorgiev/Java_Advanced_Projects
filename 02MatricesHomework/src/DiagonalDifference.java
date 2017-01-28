import java.util.Scanner;

/**
 * Created by christian on 18.01.17.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int[][] matrix = new int[n][n];
        
        int diagonal1 = 0;
        int diagonal2 = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = console.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            diagonal1+=matrix[i][i];
        }
        int temp = matrix.length-1;
        for (int i = 0; i < matrix.length; i++) {
                diagonal2+=matrix[i][temp];
                temp--;
        }

        System.out.println(Math.abs(diagonal1-diagonal2));
    }
}
