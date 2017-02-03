import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String input = console.readLine();
        StringBuilder inputSB = new StringBuilder(input);
        System.out.println(inputSB.reverse());
    }
}
