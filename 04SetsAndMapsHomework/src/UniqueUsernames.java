import java.util.LinkedHashSet;
import java.util.Scanner;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        LinkedHashSet<String> names = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            String name = console.nextLine();
            if (!names.contains(name)) {
                names.add(name);
            }
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
