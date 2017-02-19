import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class HighScore {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = console.readLine().split("<->");
        LinkedHashMap<String, LinkedHashMap<String, Long>> map = new LinkedHashMap<>();

        while (!"osu!".equals(inputLine[0])){
            String[] player1 = inputLine[0].split(" ");
            String[] player2 = inputLine[1].split(" ");

            map.putIfAbsent(player1[1], new LinkedHashMap<>());
            map.putIfAbsent(player2[0], new LinkedHashMap<>());

            long duelDifference = Long.valueOf(player1[0]) - Long.valueOf(player2[1]);
                if (duelDifference>0) {
                    map.get(player1[1]).putIfAbsent(player2[0], (duelDifference * (-1)));
                    map.get(player2[0]).putIfAbsent(player1[1], duelDifference);
                }else if (duelDifference<0){
                    map.get(player1[1]).putIfAbsent(player2[0], duelDifference);
                    map.get(player2[0]).putIfAbsent(player1[1], (duelDifference * (-1)));
                }

            inputLine = console.readLine().split("<->");
        }

LinkedHashMap<String, LinkedHashMap<String, Long>> sortedMap = new LinkedHashMap<>();







      String debug = "";
//        TreeMap<Long, String> sortedMap = new TreeMap<>(Collections.reverseOrder());
//
//        for (String s : map.keySet()) {
//            long totalPoints = 0;
//            for (Long points : map.get(s).values()) {
//                totalPoints+= points;
//            }
//            sortedMap.put(totalPoints, s);
//        }
//
//
//        for (Map.Entry<Long, String> entry : sortedMap.entrySet()) {
//            String name = entry.getValue();
//            long points = entry.getKey();
//            if (map.containsKey(name)){
//                System.out.println(name + " - " + "("+ points +")");
//                LinkedHashMap<String, Long> currentDuels = map.get(name);
//
//                for (String s : currentDuels.keySet()) {
//                    System.out.println("*   " + s + " <-> " + currentDuels.get(s));
//                }
//            }
//        }
    }
}
