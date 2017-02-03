import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FromBaseTenToBaseN {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] inputArr = console.readLine().split("\\s+");
        BigInteger n  = new BigInteger(inputArr[0]);
        BigInteger numberN  = new BigInteger(inputArr[1]);

        BigInteger base10 = new BigInteger("");

        while (base10.compareTo(new BigInteger("0")) > 0){
            BigInteger reminder = base10.divideAndRemainder(new BigInteger(n + ""))[1];
            BigInteger divide = base10.divideAndRemainder(new BigInteger(n+""))[0];
        }
    }
}
