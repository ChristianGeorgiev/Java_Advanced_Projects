import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BiPredicate;

public class ListOfPredicates {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.valueOf(console.readLine());
        Integer[] sequence = parseToIntArray(console.readLine().split("\\s+"));

        BiPredicate<Integer, Integer> isDivisible = (n,d) -> {
          if (n%d==0){
              return true;
          }
          return false;
        };

        for (int i = 1; i <= num; i++) {
            boolean isDiv = true;
            for (int j = 0; j < sequence.length; j++) {
                if (!(isDivisible.test(i,sequence[j]))){
                    isDiv = false;
                }
            }

            if (isDiv){
                System.out.print(i + " ");
            }
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
