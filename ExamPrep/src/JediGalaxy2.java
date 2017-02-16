import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class JediGalaxy2 {
    private static int[][] matrix;
    private static int sumStars;

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] sizes = console.readLine().split("\\s+");
        int rows = Integer.valueOf(sizes[0]);
        int cols = Integer.valueOf(sizes[1]);
        matrix = new int[rows][cols];
        fillMatrix();

        List<String> ivoCoordinates = new ArrayList<>();
        List<String> evilCoordinates = new ArrayList<>();

        String inputLine = console.readLine();
        int lineCounter = 1;
        while (!"Let the Force be with you".equals(inputLine)){
            if (lineCounter % 2 != 0){
                ivoCoordinates.add(inputLine);
            }else {
                evilCoordinates.add(inputLine);
            }
            lineCounter++;
            inputLine = console.readLine();
        }

        for (String evilCoordinate : evilCoordinates) {
            int evilStartRow = Integer.valueOf(evilCoordinate.split("\\s+")[0]);
            int evilStartCol = Integer.valueOf(evilCoordinate.split("\\s+")[1]);

            for (int i = 0; i <= matrix.length; i++) {
                if (isInMatrix(evilStartRow - i, evilStartCol - i)){
                    matrix[evilStartRow - i][evilStartCol - i] = 0;
                }
            }
        }

        for (String ivoCoordinate : ivoCoordinates) {
            int ivoStartRow = Integer.valueOf(ivoCoordinate.split("\\s+")[0]);
            int ivoStartCol = Integer.valueOf(ivoCoordinate.split("\\s+")[1]);

            for (int i = 0; i <= matrix.length; i++) {
                if (isInMatrix(ivoStartRow - i, ivoStartCol + i)){
                    sumStars += matrix[ivoStartRow - i][ivoStartCol + i];
                }
            }
        }
        System.out.println(sumStars);
    }

    private static boolean isInMatrix(int row, int col) {
        if (row < matrix.length && row >= 0 && col < matrix[0].length && col >= 0){
            return true;
        }
        return false;
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
