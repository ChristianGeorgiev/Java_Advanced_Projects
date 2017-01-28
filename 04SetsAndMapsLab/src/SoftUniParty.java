import java.util.*;

/**
 * Created by christian on 24.01.17.
 */
public class SoftUniParty {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Set<String> vip = new TreeSet<>();
        Set<String> regular = new HashSet<>();

        ArrayList<String> numbers = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            numbers.add(String.valueOf(i));
        }
        while (true){
            String input = console.nextLine();
            if ("PARTY".equals(input)){
                break;
            }

            if (numbers.contains(String.valueOf(input.charAt(0))) && input.length()==8){
                vip.add(input);
            }else if (input.length()==8){
                regular.add(input);
            }
        }

        while (true){
            String input = console.nextLine();
            if ("END".equals(input)){
                break;
            }

            if (vip.contains(input)){
                vip.remove(input);
            }else if (regular.contains(input)){
                regular.remove(input);
            }
        }

        Set<String> output = new TreeSet<>();
        output.addAll(vip);
        output.addAll(regular);

        System.out.println(output.size());
        for (String person : output) {
            System.out.println(person);
        }
    }
}
