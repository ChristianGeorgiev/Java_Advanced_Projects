import java.util.Scanner;
import java.util.TreeMap;


public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        TreeMap<String, Double> graduates = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = console.nextLine();
            String[] grades = console.nextLine().split(" ");
            double average = 0;
            for (int j = 0; j < grades.length; j++) {
                average += Double.valueOf(grades[j]);
            }
            average /= grades.length;
            
            graduates.put(name, average);
        }

        for (String student : graduates.keySet()) {
            System.out.println(student + " is graduated with " + graduates.get(student));
        }

    }
}
