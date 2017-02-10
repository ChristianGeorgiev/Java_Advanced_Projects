import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UpperStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] names = console.readLine().split("\\s+");
        Arrays.stream(names).forEach(x -> System.out.print(x.toUpperCase() + " "));
    }
}
