import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RoyalAccounting {
    private static LinkedHashMap<String, LinkedHashMap<String, List<Double>>> map = new LinkedHashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        Pattern pattern = Pattern.compile("([A-Za-z]+);(\\d+);(\\d+\\.*\\d*);([A-Za-z]+)");
        String line = console.readLine();
        while (!"Pishi kuf i da si hodim".equals(line)){
            Matcher matcher = pattern.matcher(line);
//{employeeName};{workHoursPerDay};{dailyPayment};{team}
            if (matcher.find()){
                String name = matcher.group(1);
                double workHoursPerDay = Double.parseDouble(matcher.group(2));
                double dailyPayment = Double.valueOf(matcher.group(3));
                String team = matcher.group(4);
                putInMap(name, workHoursPerDay, dailyPayment, team);
            }
            line = console.readLine();
        }
        printMap();
    }

    private static void putInMap(String name, double workHoursPerDay, double dailyPayment, String team) {
        map.put(team, new LinkedHashMap<>());
        List<Double> temp = new ArrayList<>();
        temp.add(workHoursPerDay);
        temp.add((dailyPayment*workHoursPerDay)/24);
        temp.add(((dailyPayment*workHoursPerDay)/24)*30);
        LinkedHashMap<String, List<Double>> temp2 = new LinkedHashMap<>();
        temp2.put(name, temp);
        map.put(team, temp2);
    }

    private static void printMap(){
        for (String s : map.keySet()) {
            System.out.println("Team - " + s);
            for (String s1 : map.get(s).keySet()) {
                System.out.println("$$$" + s1 + " - " + String.format("%.0f",map.get(s).get(s1).get(0)) + " - "
                        + String.format("%.6f",map.get(s).get(s1).get(1)));
            }
        }
    }


}
