import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class FilterByAge {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(console.readLine());
        LinkedHashMap<String, Integer> people = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = console.readLine().split(", ");
            people.put(line[0], Integer.valueOf(line[1]));
        }

        String command = console.readLine();
        int commandAge = Integer.valueOf(console.readLine());

        String criteria = console.readLine();
    }
}
