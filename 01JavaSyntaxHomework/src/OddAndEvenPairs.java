import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputStr = console.nextLine().split(" ");
        int[] input = new int[inputStr.length];
        for (int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(inputStr[i]);
        }
        if (input.length%2==0){
            for (int i = 0; i < input.length-1; i=i+2) {
                int first = input[i];
                int second = input[i+1];

                if (first%2==0 && second%2==0){
                    System.out.printf("%d, %d -> both are even%n", first, second);
                }else if(first%2!=0 && second%2!=0){
                    System.out.printf("%d, %d -> both are odd%n", first, second);
                }else{
                    System.out.printf("%d, %d -> different%n", first, second);
                }

            }
        }else{
            System.out.println("invalid length");
        }
    }
}
