import java.util.Scanner;


public class BlurFilter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int blurAmount = Integer.parseInt(console.nextLine());
        String[] parameters = console.nextLine().split(" ");
        int row = Integer.parseInt(parameters[0]);
        int col = Integer.parseInt(parameters[1]);


        long[][] matrix = new long[row][col];
        for (int i = 0; i < matrix.length; i++) {
            String[] temp = console.nextLine().split(" ");
            for (int j = 0; j < col; j++) {
                matrix[i][j] = Long.parseLong(temp[j]);
            }
        }
        int blurRow=console.nextInt();
        int blurCol = console.nextInt();

        if (CheckElement(matrix, blurRow, blurCol))
            matrix[blurRow][blurCol]+=blurAmount;
        if (CheckElement(matrix, blurRow, blurCol-1))
            matrix[blurRow][blurCol-1]+=blurAmount;
        if (CheckElement(matrix, blurRow, blurCol+1))
            matrix[blurRow][blurCol+1]+=blurAmount;


        if (CheckElement(matrix, blurRow+1, blurCol))
            matrix[blurRow+1][blurCol]+=blurAmount;
        if (CheckElement(matrix, blurRow+1, blurCol-1))
            matrix[blurRow+1][blurCol-1]+=blurAmount;
        if (CheckElement(matrix, blurRow+1, blurCol+1))
            matrix[blurRow+1][blurCol+1]+=blurAmount;


        if (CheckElement(matrix, blurRow-1, blurCol))
            matrix[blurRow-1][blurCol]+=blurAmount;
        if (CheckElement(matrix, blurRow-1, blurCol-1))
            matrix[blurRow-1][blurCol-1]+=blurAmount;
        if (CheckElement(matrix, blurRow-1, blurCol+1))
            matrix[blurRow-1][blurCol+1]+=blurAmount;


        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean CheckElement(long[][] matrix, int row, int col){
        try{
            matrix[row][col]=matrix[row][col];
            return true;
        }catch (IndexOutOfBoundsException exception){
            return false;
        }
    }
}
