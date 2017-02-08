import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;

public class ConsumerPrint {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String people = console.readLine();

        Function<String,String[]> func = x -> x.split("\\s+");
        for (String s : func.apply(people)) {
            System.out.println(s);
        }
    }
}
