import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JediGalaxy {
    private static int[][] matrix;
    private static long sumStars;

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] sizes = console.readLine().split("\\s+");
        int rows = Integer.valueOf(sizes[0]);
        int cols = Integer.valueOf(sizes[1]);
        matrix = new int[rows][cols];
        fillMatrix();

        String inputLine = console.readLine();
        //int lineCounter = 1;
        while (!"Let the Force be with you".equals(inputLine)){

            String secondLine = console.readLine();
            evilIterate(secondLine);
            ivoIterate(inputLine);
            inputLine = console.readLine();
        }
            System.out.println(sumStars);
    }

    private static void ivoIterate(String ivoCoordinate) {
        int ivoStartRow = Integer.valueOf(ivoCoordinate.split("\\s+")[0]);
        int ivoStartCol = Integer.valueOf(ivoCoordinate.split("\\s+")[1]);

        while (!isInMatrix(ivoStartRow, ivoStartCol)){
            if (ivoStartRow < 0 || ivoStartCol > matrix[0].length){
                break;
            }
            ivoStartRow--;
            ivoStartCol++;
        }
        while (isInMatrix(ivoStartRow, ivoStartCol)){
                sumStars += matrix[ivoStartRow][ivoStartCol];
                ivoStartRow--;
                ivoStartCol++;
        }
    }

    private static void evilIterate(String evilCoordinate) {
        int evilStartRow = Integer.valueOf(evilCoordinate.split("\\s+")[0]);
        int evilStartCol = Integer.valueOf(evilCoordinate.split("\\s+")[1]);

        while (!isInMatrix(evilStartRow, evilStartCol)){
            if (evilStartRow < 0 || evilStartCol < 0){
                break;
            }
            evilStartRow--;
            evilStartCol--;
        }

        while (isInMatrix(evilStartRow, evilStartCol)){
                matrix[evilStartRow][evilStartCol] = 0;
                evilStartRow--;
                evilStartCol--;
        }
    }


    private static boolean isInMatrix(int row, int col) {
        return ((row < matrix.length && row >= 0) && (col < matrix[0].length && col >= 0));
    }


    private static void printMatrix() {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrix() {
        int filler = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = filler;
                filler++;
            }
        }
    }
}
