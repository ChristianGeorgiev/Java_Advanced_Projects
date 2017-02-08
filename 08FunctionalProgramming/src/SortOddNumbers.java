import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.function.Function;

public class SortOddNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = console.readLine().split(", ");
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < inputLine.length; i++) {
            integers.add(Integer.parseInt(inputLine[i]));
        }
        String filtered = "";
        String sorted = "";

        integers.removeIf(n -> n % 2 != 0);
        for (Integer integer : integers) {
            filtered += integer+", ";
        }
        integers.sort((a,b) -> a.compareTo(b));
        System.out.println();
        for (Integer integer : integers) {
            sorted += integer + ", ";
        }

        System.out.println(new StringBuilder(filtered).deleteCharAt(filtered.length()-2));
        System.out.println(new StringBuilder(sorted).deleteCharAt(sorted.length()-2));
    }
}
