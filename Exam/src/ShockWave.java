import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShockWave {
    private static int[][] matrix;
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] sizes = console.readLine().split("\\s+");
        matrix = new int[Integer.valueOf(sizes[0])][Integer.valueOf(sizes[1])];
        fillMatrix();
        String[] line = console.readLine().split("\\s+");
        while (!"Here".equals(line[0])){
            shockWave(line);
            line = console.readLine().split("\\s+");
        }
        printMatrix();
    }

    private static void fillMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = 0;
            }
        }
    }
    private static void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void shockWave(String[] line) {
        int x1 = Integer.valueOf(line[0]);
        int y1 = Integer.valueOf(line[1]);
        int x2 = Integer.valueOf(line[2]);
        int y2 = Integer.valueOf(line[3]);

        for (int row = x1; row <= x2; row++) {
            for (int col = y1; col <= y2; col++) {
                matrix[row][col]++;
            }
        }
    }
}
