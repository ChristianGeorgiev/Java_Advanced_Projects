import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class FindTheSmallestElement {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = console.readLine().split("\\s+");
        ArrayList<Integer> integers = new ArrayList<>();
        for (String s : inputLine) {
            integers.add(Integer.valueOf(s));
        }

        Function<ArrayList<Integer>, Integer> findTheSmallest = x -> {
            int min = Collections.min(x);
            return x.lastIndexOf(min);
        };
        System.out.println(findTheSmallest.apply(integers));

    }
}
