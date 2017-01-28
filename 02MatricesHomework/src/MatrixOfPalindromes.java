import java.util.Scanner;

/**
 * Created by christian on 18.01.17.
 */
public class MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        short r = console.nextShort();
        short c = console.nextShort();

        String[][] matrix = new String[r][c];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            char first = (char)(i+97);
            char middle = (char)(i + j + 97);
            String element = ""+first+""+middle+""+first;
            matrix[i][j] = element;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
