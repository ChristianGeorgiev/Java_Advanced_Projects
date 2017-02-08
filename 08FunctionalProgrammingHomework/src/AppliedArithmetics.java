import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.Function;

public class AppliedArithmetics {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Integer[] integers = parseToIntArray(console.readLine().split("\\s+"));

        Function<Integer[], Integer[]> add = x -> {
            for (int i = 0; i < x.length; i++) {
                x[i] = x[i] + 1;
            }
            return x;
        };

        Function<Integer[], Integer[]> subtract = x -> {
            for (int i = 0; i < x.length; i++) {
                x[i] = x[i] - 1;
            }
            return x;
        };

        Function<Integer[], Integer[]> multiply = x -> {
            for (int i = 0; i < x.length; i++) {
                x[i] = x[i] * 2;
            }
            return x;
        };

        Consumer<Integer[]> print = x -> {
            for (int i = 0; i < x.length; i++) {
                System.out.print(x[i] + " ");
            }
            System.out.println();
        };

        String command = console.readLine();
        if (command.equals("end")){
            print.accept(integers);
            return;
        }
        while (!"end".equals(command)){
            if (command.equals("add")){
                integers = add.apply(integers);
            }else if (command.equals("subtract")){
                integers = subtract.apply(integers);
            }else if (command.equals("multiply")){
                integers = multiply.apply(integers);
            }else if (command.equals("print")){
                print.accept(integers);
            }

            command = console.readLine();
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
