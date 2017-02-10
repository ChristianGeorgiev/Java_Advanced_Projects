import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Stream;

public class FirstName {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        List<String> names = Arrays.asList(console.readLine().split("\\s+"));
        HashSet<Character> chars = new HashSet<>();

        Stream.of(console.readLine().split("\\s+")).map(s -> s.toLowerCase().charAt(0))
                .forEach(s -> chars.add(s));

        Optional<String> first = names.stream().filter(s -> chars.contains(s.toLowerCase().charAt(0)))
                .sorted().findFirst();

        if (first.isPresent()){
            System.out.println(first.get());
        }else {
            System.out.println("No match");
        }
    }
}
