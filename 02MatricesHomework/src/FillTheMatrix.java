import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] input = console.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1].toLowerCase();
        int[][] matrix = new int[n][n];

        if (pattern.equals("a")){
            patternA(matrix);
        }else {
            patternB(matrix);
        }
    }

    static void patternA (int[][] matrix){
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[j][i] = temp+1;
                temp++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void patternB (int[][] matrix){
        int temp = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (i%2==0){
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = temp+1;
                    temp++;
                }
            }else{
                for (int j = 0; j < matrix.length; j++) {
                    matrix[matrix.length-j-1][i] = temp+1;
                    temp++;
                }
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
