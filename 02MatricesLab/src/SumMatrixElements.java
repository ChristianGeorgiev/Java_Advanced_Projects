import java.util.Scanner;

/**
 * Created by christian on 17.01.17.
 */
public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] parameters = console.nextLine().split(", ");
        int row = Integer.parseInt(parameters[0]);
        int col = Integer.parseInt(parameters[1]);
        int sum = 0;

        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            String[] temp = console.nextLine().split(", ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(temp[j]);
                sum+=matrix[i][j];
            }
        }
        System.out.println(row);
        System.out.println(col);
        System.out.println(sum);


    }
}
