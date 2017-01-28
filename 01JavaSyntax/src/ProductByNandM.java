import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by christian on 16.01.17.
 */
public class ProductByNandM {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        int m = console.nextInt();
        int index = n;
        BigInteger total = BigInteger.ONE;
        do {
            total = total.multiply(new BigInteger(String.valueOf(index)));
            index++;
        }while (index<=m);
        System.out.printf("product[%d..%d] = %d", n,m,total);
    }
}
