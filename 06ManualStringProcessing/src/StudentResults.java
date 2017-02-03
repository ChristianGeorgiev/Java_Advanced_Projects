import sun.misc.FloatingDecimal;

import java.lang.reflect.Array;
import java.util.*;

public class StudentResults {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        TreeMap<String, ArrayList<Double>> output = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = console.nextLine().split(" - ");
            String[] gradesStr = input[1].split(", ");
            ArrayList<Double> grades = new ArrayList<>();
            double average = 0;
            for (int j = 0; j < gradesStr.length; j++) {
                grades.add(Double.parseDouble(gradesStr[j]));
                average += Double.parseDouble(gradesStr[j]);
            }
            average /= gradesStr.length;
            grades.add(average);

            output.put(input[0], grades);
        }

        System.out.println(String.format("%-10s|%7s|%7s|%7s|%7s|", "Name", "JAdv", "JavaOOP","AdvOOP","Average"));
        for (String s : output.keySet()) {
            System.out.println(String.format("%-10s|%7.2f|%7.2f|%7.2f|%7.4f|", s, output.get(s).get(0), output.get(s).get(1), output.get(s).get(2), output.get(s).get(3)));
        }
    }
}
