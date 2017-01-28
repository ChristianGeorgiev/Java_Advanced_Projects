import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        LinkedHashMap<String,String> emails = new LinkedHashMap<>();

        while (true){
            String name = console.nextLine();
            if ("stop".equals(name)){
                break;
            }
            String email = console.nextLine();
            String[] emailWebsite = email.toLowerCase().split("@");
            String[] dotSomething = emailWebsite[emailWebsite.length-1].split("\\.");

            if (!emails.containsKey(name)){
                if (!("us".equals(dotSomething[dotSomething.length-1]) ||
                        "uk".equals(dotSomething[dotSomething.length-1]) ||
                        "com".equals(dotSomething[dotSomething.length-1]))){
                    emails.put(name, email);
                }
            }
        }

        for (String contact : emails.keySet()) {
            System.out.println(contact + " -> " + emails.get(contact));
        }
    }
}
