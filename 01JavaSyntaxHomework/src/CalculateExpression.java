import java.util.Scanner;

/**
 * Created by christian on 17.01.17.
 */
public class CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double a = console.nextDouble();
        double b = console.nextDouble();
        double c = console.nextDouble();


        double formula1 = Math.pow((Math.pow(a,2) + Math.pow(b,2)) / (Math.pow(a,2) - Math.pow(b,2)),
                ((a+b+c)/Math.sqrt(c)));

        double formula2 = Math.pow((Math.pow(a,2) + Math.pow(b,2) - Math.pow(c,3)), a-b);


        double difference = Math.abs(((a+b+c)/3) - ((formula1+formula2)/2));

        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", formula1, formula2, difference);

    }
}
