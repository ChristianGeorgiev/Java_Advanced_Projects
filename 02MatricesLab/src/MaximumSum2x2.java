import java.util.Scanner;

/**
 * Created by christian on 17.01.17.
 */
public class MaximumSum2x2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] parameters = console.nextLine().split(", ");
        int row = Integer.parseInt(parameters[0]);
        int col = Integer.parseInt(parameters[1]);

        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            String[] temp = console.nextLine().split(", ");

            for (int j = 0; j < col; j++) {
                matrix[i][j] = Integer.parseInt(temp[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int startRow = 0;
        int startCol = 0;
        for (int i = 0; i < matrix.length-1; i++) {
            int tempSum = 0;
            for (int j = 0; j < matrix[i].length-1; j++) {
                tempSum = matrix[i][j] + matrix[i+1][j] + matrix[i][j+1] + matrix[i+1][j+1];

                if (tempSum > maxSum){
                    maxSum = tempSum;
                    startRow = i;
                    startCol = j;
                }
            }
        }

        System.out.printf("%d %d%n%d %d%n", matrix[startRow][startCol], matrix[startRow][startCol+1], matrix[startRow+1][startCol], matrix[startRow+1][startCol+1]);
        System.out.println(maxSum);
    }
}
