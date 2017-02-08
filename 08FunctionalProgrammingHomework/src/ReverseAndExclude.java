import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ReverseAndExclude {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = console.readLine().split("\\s+");
        Integer divider = Integer.valueOf(console.readLine());


        BiFunction<String[], Integer, ArrayList<Integer>> reverseAndExclude = (x,d) -> {
            ArrayList<Integer> reversed = new ArrayList<>();
            for (int i = x.length-1; i >= 0; i--) {
                if (Integer.valueOf(x[i]) % d != 0) {
                    reversed.add(Integer.valueOf(x[i]));
                }
            }
            return reversed;
        };

        for (Integer integer : reverseAndExclude.apply(inputLine, divider)) {
            System.out.print(integer + " ");
        }
    }
}
