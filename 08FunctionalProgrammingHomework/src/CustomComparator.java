import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;

public class CustomComparator {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Integer[] integers = parseToIntArray(console.readLine().split("\\s+"));

        Function<Integer[], ArrayList<Integer>> comparator = x -> {
          ArrayList<Integer> evens = new ArrayList<>();
          ArrayList<Integer> odds = new ArrayList<>();
          ArrayList<Integer> result = new ArrayList<>();

            for (int i = 0; i < x.length; i++) {
                if (x[i] % 2 == 0){
                    evens.add(x[i]);
                }else {
                    odds.add(x[i]);
                }
            }
            Collections.sort(evens);
            Collections.sort(odds);
            result.addAll(evens);
            result.addAll(odds);
            return result;
        };

        for (Integer integer : comparator.apply(integers)) {
            System.out.print(integer + " ");
        }
    }

    private static Integer[] parseToIntArray (String[] input){
        Integer[] integers = new Integer[input.length];

        for (int i = 0; i < integers.length; i++) {
            integers[i] = Integer.valueOf(input[i]);
        }
        return integers;
    }
}
