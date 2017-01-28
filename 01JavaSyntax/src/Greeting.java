import java.util.Scanner;

/**
 * Created by christian on 16.01.17.
 */
public class Greeting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String firstName = console.nextLine();
        String secondName = console.nextLine();

        if (firstName.isEmpty() || firstName.equals(null)){
            firstName = "*****";
        }
        if (secondName.isEmpty() || secondName.equals(null)){
            secondName = "*****";
        }

        System.out.printf("Hello, %s %s!", firstName, secondName);
    }
}
