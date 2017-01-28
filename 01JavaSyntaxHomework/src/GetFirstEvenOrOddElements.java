import java.util.Scanner;

public class GetFirstEvenOrOddElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputStr = console.nextLine().split(" ");
        int[] input = new int[inputStr.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(inputStr[i]);
        }
        String[] parametersArray = console.nextLine().split(" ");
        String type = parametersArray[parametersArray.length-1];
        int count = Integer.parseInt(parametersArray[parametersArray.length-2]);
        int counter = 0;
        if (type.equals("even")){
            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 == 0){
                    System.out.print(input[i] + " ");
                    counter++;
                }

                if (counter == count){
                    break;
                }
            }
            System.out.println();
        }else{
            for (int i = 0; i < input.length; i++) {
                if (input[i] % 2 != 0){
                    System.out.print(input[i] + " ");
                    counter++;
                }

                if (counter == count){
                    break;
                }
            }
            System.out.println();
        }

    }
}
