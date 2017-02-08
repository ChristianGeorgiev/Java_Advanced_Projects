import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LettersChangeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = console.readLine().split("\\s+");

        double totalSum = 0;
        for (String s : strings) {
            char firstChar = s.charAt(0);
            char lastChar = s.charAt(s.length()-1);
            double number = Double.parseDouble(s.substring(1, s.length()-1));
            double currentSum = 0;

            if (firstChar > 64 && firstChar < 91){
                //Uppercase
                currentSum = number / ((double)firstChar - 64);
            }else {
                //Lowercase
                currentSum = number * ((double)firstChar - 96);
            }

            if (lastChar> 64 && lastChar < 91){
                //Uppercase
                currentSum -= ((double)lastChar - 64);
            }else {
                //Lowercase
                currentSum += ((double)lastChar - 96);
            }

            totalSum += currentSum;
        }
        System.out.printf("%.2f",totalSum);
    }
}
