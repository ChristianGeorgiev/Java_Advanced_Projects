import java.util.Scanner;

/**
 * Created by christian on 18.01.17.
 */
public class MaximalSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int row = console.nextInt();
        int col = console.nextInt();
        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = console.nextInt();
            }
        }
        int bestSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;
        for (int i = 1; i < matrix.length-1; i++) {
            for (int j = 1; j < matrix[i].length-1; j++) {
                int tempSum = 0;
            tempSum+= matrix[i][j] + matrix[i][j-1] + matrix[i][j+1];
            tempSum+= matrix[i-1][j] + matrix[i-1][j-1] + matrix[i-1][j+1];
            tempSum+= matrix[i+1][j] + matrix[i+1][j-1] + matrix[i+1][j+1];
                if (tempSum>bestSum){
                    bestSum=tempSum;
                    bestRow=i;
                    bestCol=j;
                }
            }
        }

        System.out.println("Sum = " + bestSum);
        System.out.printf("%d %d %d%n", matrix[bestRow-1][bestCol-1], matrix[bestRow-1][bestCol],                                                                                       matrix[bestRow-1][bestCol+1] );
        System.out.printf("%d %d %d%n", matrix[bestRow][bestCol-1], matrix[bestRow][bestCol],                                                                                       matrix[bestRow][bestCol+1] );
        System.out.printf("%d %d %d%n", matrix[bestRow+1][bestCol-1], matrix[bestRow+1][bestCol],                                                                                       matrix[bestRow+1][bestCol+1] );

    }
}
