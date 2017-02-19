import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Royalism {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] line = console.readLine().split("\\s+");
        List<String> royalists = new ArrayList<>();
        List<String> nonRoyalists = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < line[i].length(); j++) {
                currentSum += line[i].charAt(j);
            }
            while (currentSum >= 26){
                currentSum -= 26;
            }
            if (currentSum == 18){
                royalists.add(line[i]);
            }else {
                nonRoyalists.add(line[i]);
            }
        }

        if (royalists.size() >= nonRoyalists.size()){
            System.out.println("Royalists - " + royalists.size());
            for (String royalist : royalists) {
                System.out.println(royalist);
            }
            System.out.println("All hail Royal!");
        }else {
            for (String nonRoyalist : nonRoyalists) {
                System.out.println(nonRoyalist);
            }
            System.out.println("Royalism, Declined!");
        }
    }
}
