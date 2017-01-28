import java.util.Scanner;

/**
 * Created by christian on 18.01.17.
 */
public class TwoByTwoSquaresInMatrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int row = console.nextInt();
        int col = console.nextInt();
        char[][] matrix = new char[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = console.next().charAt(0);
            }
        }

        int totalSquares = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length; j++) {
                    if (matrix[i][j] == matrix[i-1][j]
                        && matrix[i][j]== matrix[i][j-1]
                        && matrix[i][j]== matrix[i-1][j-1]){
                        totalSquares++;
                    }
            }
        }
        System.out.println(totalSquares);
    }
}
