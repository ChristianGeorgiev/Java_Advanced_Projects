import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by christian on 16.01.17.
 */
public class EuroTrip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double kilos = Double.parseDouble(console.nextLine());
        double pricePerKiloBGN = 1.20;

        BigDecimal priceInBGN = new BigDecimal(kilos*pricePerKiloBGN);
        BigDecimal exchangeRate = new BigDecimal("4210500000000");
        BigDecimal priceInDM = priceInBGN.multiply(exchangeRate);

        System.out.printf("%.2f marks", priceInDM);
    }
}
