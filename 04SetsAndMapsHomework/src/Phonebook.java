import java.util.HashMap;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        HashMap<String, String> phonebook = new HashMap<>();

        while (true){
            String[] input = console.nextLine().split("-");
            if ("search".equals(input[0])){
                break;
            }
            phonebook.put(input[0], input[1]);
        }

        while (true){
            String input = console.nextLine();
            if ("stop".equals(input)){
                break;
            }

            if (phonebook.containsKey(input)){
                System.out.println(input + " -> " + phonebook.get(input));
            }else {
                System.out.println("Contact " + input + " does not exist.");
            }
        }
    }
}
