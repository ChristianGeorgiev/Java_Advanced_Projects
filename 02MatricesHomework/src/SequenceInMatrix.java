import java.util.ArrayList;
import java.util.Scanner;


public class SequenceInMatrix {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int row = console.nextInt();
        int col = console.nextInt();
        String[][] matrix = new String[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = console.next();
            }
        }

        String[] sequence = CheckRows(matrix);
        if (CheckColumns(matrix).length>sequence.length){
            sequence=CheckColumns(matrix);
        }
        if (LeftToRightDiagonal(matrix).length > sequence.length){
            sequence=LeftToRightDiagonal(matrix);
        }

        for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + ", ");
        }
    }

    static String[] CheckRows(String[][] matrix) {
        int count = 1;
        int maxSeq = 1;
        String maxValue = "";
        for (int i = 0; i < matrix.length-1; i++) {
            for (int j = 0; j < matrix[i].length-1; j++) {
                if (matrix[i][j].equals(matrix[i][j+1])){
                    count++;
                }else{
                    count=1;
                }
                if (count>=maxSeq){
                    maxSeq=count;
                    maxValue = matrix[i][j];
                }
            }
            count=1;
        }
        String[] sequence = new String[maxSeq];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = maxValue;
        }
        return sequence;
    }

    static String[] CheckColumns (String[][] matrix){
        int count = 1;
        int maxSeq = 1;
        String maxValue = "";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length-1; j++) {
                if (matrix[j][i].equals(matrix[j+1][i])){
                    count++;
                }else{
                    count=1;
                }
                if (count>=maxSeq){
                    maxSeq=count;
                    maxValue = matrix[j][i];
                }
            }
            count=1;
        }
        String[] sequence = new String[maxSeq];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = maxValue;
        }
        return sequence;
    }

    static String[] LeftToRightDiagonal (String[][] matrix){
        int count = 1;
        int maxSeq = 1;
        String maxValue = "";
        int j = 0;
        int diagonal = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < diagonal-1; i++) {
            if (j != i){
                break;
            }
            if (matrix[i][j].equals(matrix[i+1][j+1])){
                count++;
            }else{
                count=1;
            }
            if (count>=maxSeq){
                maxSeq=count;
                maxValue=matrix[i][j];
            }
            j++;
        }
        String[] sequence = new String[maxSeq];
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = maxValue;
        }
        return sequence;
    }

}
