import java.util.Scanner;

/**
 * Created by christian on 18.01.17.
 */
public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sevenBase = console.nextInt();
        String length = sevenBase+"";
        int sum = 0;

        for (int i = 0; i < length.length(); i++) {
            sum += (sevenBase%10) * Math.pow(7, i);
            sevenBase/=10;
        }

        System.out.println(sum);
    }
}
