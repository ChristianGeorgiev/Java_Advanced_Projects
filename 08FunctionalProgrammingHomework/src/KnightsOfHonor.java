import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;

public class KnightsOfHonor {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] names = console.readLine().split("\\s+");

        Consumer<String> addSir = x -> System.out.println("Sir " + x);
        for (String name : names) {
            addSir.accept(name);
        }
    }
}
