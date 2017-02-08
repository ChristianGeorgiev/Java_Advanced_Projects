import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Function;

public class AddVAT {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String[] input = console.readLine().split(", ");
        Function<String,Double> vatAdder = x -> Double.parseDouble(x)*1.2;

        ArrayList<Double> priceWithVAT = new ArrayList<>();
        System.out.println("Prices with VAT:");

        for (String s : input) {
            priceWithVAT.add(vatAdder.apply(s));
        }
        for (Double price : priceWithVAT) {
            System.out.println(new StringBuilder(String.format("%.2f", price).replace('.', ',')));
        }


    }
}
