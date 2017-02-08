import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = console.readLine().split(", ");

        Function<String, Integer> parser = x -> Integer.parseInt(x);

        int sum = 0;
        for (String s : inputLine) {
            sum+=parser.apply(s);
        }
        System.out.println("Count = " + inputLine.length);
        System.out.println("Sum = " + sum);
    }
}
