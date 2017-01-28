import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char[] input = console.nextLine().toCharArray();
        TreeMap<Character, Integer> symbolCounter = new TreeMap<>();

        for (int i = 0; i < input.length; i++) {
            symbolCounter.put(input[i], 0);
        }

        for (int i = 0; i < input.length; i++) {
            if (symbolCounter.containsKey(input[i])){
                symbolCounter.put(input[i], symbolCounter.get(input[i])+1);
            }
        }

        for (Character character : symbolCounter.keySet()) {
            System.out.println(character + ": " + symbolCounter.get(character) + " time/s");
        }
    }
}
