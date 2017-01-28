import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Created by christian on 19.01.17.
 */
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        long decimal = Long.parseLong(console.nextLine());
        ArrayDeque<Long> binary = new ArrayDeque<>();

        if (decimal==0){
            System.out.println("0");
            return;
        }
        while (decimal!=0){
            binary.push(decimal%2);
            decimal/=2;
        }
        while (!binary.isEmpty()){
            System.out.print(binary.pop());
        }
        System.out.println();
    }
}
