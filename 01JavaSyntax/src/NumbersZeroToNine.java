import java.util.Scanner;

/**
 * Created by christian on 16.01.17.
 */
public class NumbersZeroToNine {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int counter = 0;
        while(counter < 10){
            System.out.printf("Number: %d", counter);
            System.out.println();
            counter++;
        }
    }
}
