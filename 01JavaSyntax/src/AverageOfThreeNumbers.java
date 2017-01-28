import java.util.Scanner;

/**
 * Created by christian on 16.01.17.
 */
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double first = console.nextDouble();
        double second = console.nextDouble();
        double third = console.nextDouble();

        double avg = (first + second + third)/3;
        System.out.printf("%.2f", avg);
    }
}
