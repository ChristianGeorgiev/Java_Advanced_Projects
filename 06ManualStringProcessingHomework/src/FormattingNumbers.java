import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FormattingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] inputStr = console.readLine().split("\\s+");
        int a = Integer.parseInt(inputStr[0]);
        double b = Double.parseDouble(inputStr[1]);
        double c = Double.parseDouble(inputStr[2]);

        String hexiDecimalA = Integer.toHexString(a).toUpperCase();
        String binaryA = Integer.toBinaryString(a);
        while (binaryA.length()<10){
            binaryA = "0" + binaryA;
        }
        if (binaryA.length() > 10){
            binaryA = binaryA.substring(0, 10);
        }

        System.out.println(String.format("|%-10s|%s|%10.2f|%-10.3f|", hexiDecimalA,binaryA,b,c));
    }
}
