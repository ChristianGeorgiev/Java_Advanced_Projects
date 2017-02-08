import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int nameLength = Integer.valueOf(console.readLine());
        String[] names = console.readLine().split("\\s+");

        BiPredicate<String, Integer> checkNameLength = (s,l) -> {
          if (s.length() <= l){
              return true;
          }
          else {
              return false;
          }
        };

        for (String name : names) {
            if (checkNameLength.test(name, nameLength)){
                System.out.println(name);
            }
        }
    }
}
