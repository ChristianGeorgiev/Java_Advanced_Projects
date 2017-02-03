import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class SumBigNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        BigInteger num1 = new BigInteger(console.readLine());
        BigInteger num2 = new BigInteger(console.readLine());

        BigInteger sum = num1.add(num2);
        System.out.println(sum);
    }
}
