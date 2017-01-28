import java.util.Scanner;

/**
 * Created by christian on 16.01.17.
 */
public class CalculateTriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double base = console.nextDouble();
        double height = console.nextDouble();

        System.out.printf("Area = %.2f", Area(base,height));
    }

    static double Area (double base, double height){
        double area = (base*height)/2;
        return area;
    }
}
