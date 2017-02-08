import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class CustomMinFunction {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] input = console.readLine().split("\\s+");
        Integer[] integers = new Integer[input.length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.valueOf(input[i]);
        }

        Function<Integer[], Integer> min = x -> {
           int bestMinimal = Integer.MAX_VALUE;
            for (int i = 0; i < x.length; i++) {
                if (x[i] < bestMinimal){
                    bestMinimal = x[i];
                }
            }
            return bestMinimal;
        };

        System.out.println(min.apply(integers));
    }
}
