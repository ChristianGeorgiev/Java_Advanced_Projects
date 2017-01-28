import java.util.ArrayList;
import java.util.Scanner;

public class ConvertToBaseMinus7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int decimal = console.nextInt();
        ArrayList<Integer> converted = new ArrayList<>();
        int counter = 0;

        for (int i = decimal; i > 0 ; i=i/(7)) {
            converted.add(i%(-7));
        }

        for (int i = converted.size()-1; i >= 0 ; i--) {
            System.out.print(converted.get(i));
        }
    }
}
