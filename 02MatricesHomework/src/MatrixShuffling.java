import java.util.Scanner;
import java.util.regex.Pattern;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] rowsCols = console.nextLine().split(" ");
        int row = Integer.parseInt(rowsCols[0]);
        int col = Integer.parseInt(rowsCols[1]);
        String[][] matrix = new String[row][col];

        for (int i = 0; i < row; i++) {
                matrix[i] = console.nextLine().split(" ");
        }
        //System.out.println("MATRIX INPUT END");

        String inputCommand = console.nextLine();
        //System.out.println("THIS SHOULD NOT BE PRINTED");

        final Pattern pattern = Pattern.compile("swap\\s\\d\\s\\d\\s\\d\\s\\d");
        while (!pattern.matcher(inputCommand).matches()){
            System.out.println("Invalid input!");
            inputCommand = console.nextLine();
        }

        String[] command = inputCommand.split(" ");

        while (!command[0].equals("END")){
                int row1 = Integer.parseInt(command[1]);
                int col1 = Integer.parseInt(command[2]);
                int row2 = Integer.parseInt(command[3]);
                int col2 = Integer.parseInt(command[4]);
                if (row1 < row && row2 < row && col1 < col && col2 < col
                    && row1>=0 && row2>=0 && col1>=0 && col2>=0){

                    String tempValue = matrix[row1][col1];
                    matrix[row1][col1] = matrix[row2][col2];
                    matrix[row2][col2] = tempValue;

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[i].length; j++) {
                            System.out.print(matrix[i][j] + " ");
                        }
                        System.out.println();
                    }

                }else{
                    System.out.println("Invalid input!");
                }
            command=console.nextLine().split(" ");
            }
        }
    }

