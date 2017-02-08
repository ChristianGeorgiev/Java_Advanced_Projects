import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FindEvensOrOdds {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] input = console.readLine().split("\\s+");
        int downBorder = Integer.valueOf(input[0]);
        int upBorder = Integer.valueOf(input[1]);
        String command = console.readLine();

        BiConsumer<Integer,Integer> getEven = (a, b) -> {
            ArrayList<Integer> evens = new ArrayList<>();
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0){
                    evens.add(i);
                }
            }
            for (Integer even : evens) {
                System.out.print(even + " ");
            }
        };

        BiConsumer<Integer,Integer> getOdds = (a, b) -> {
            ArrayList<Integer> evens = new ArrayList<>();
            for (int i = a; i <= b; i++) {
                if (i % 2 != 0){
                    evens.add(i);
                }
            }
            for (Integer even : evens) {
                System.out.print(even + " ");
            }
        };

        if ("odd".equals(command)){
            getOdds.accept(downBorder, upBorder);
        }else {
            getEven.accept(downBorder,upBorder);
        }
    }
}
