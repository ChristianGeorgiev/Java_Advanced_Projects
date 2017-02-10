import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class TakeTwo {
    public static void main(String[] args) throws IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        List<String> tokens = Arrays.asList(console.readLine().split("\\s+"));
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < tokens.size(); i++) {
            integers.add(Integer.valueOf(tokens.get(i)));
        }
        LinkedHashSet<Integer> result = new LinkedHashSet<>();
        integers.stream().filter(x -> x >= 10 && x <= 20).forEach(x -> result.add(x));

        result.stream().limit(2).forEach(x -> System.out.print(x + " "));
    }
}
