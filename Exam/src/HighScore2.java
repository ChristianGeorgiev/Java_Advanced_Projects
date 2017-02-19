import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.*;

public class HighScore2 {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] inputLine = console.readLine().split("<->");
        LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<>();

        while (!"osu!".equals(inputLine[0])){
            String[] player1 = inputLine[0].split(" ");
            String[] player2 = inputLine[1].split(" ");

            map.putIfAbsent(player1[1], new ArrayList<>());
            map.putIfAbsent(player2[0], new ArrayList<>());

            BigInteger duelDifference = new BigInteger(player1[0]).subtract(new BigInteger(player2[1]));

            if (Long.valueOf(player1[0]) > Long.valueOf(player2[1])) {
                map.get(player1[1]).add(player2[0]);
                map.get(player1[1]).add(String.valueOf(duelDifference));
                map.get(player2[0]).add(player1[1]);
                map.get(player2[0]).add(String.valueOf(duelDifference.multiply(new BigInteger("-1"))));
            }else if (Long.valueOf(player1[0]) < Long.valueOf(player2[1])){
                map.get(player1[1]).add(player2[0]);
                map.get(player1[1]).add(String.valueOf(duelDifference));
                map.get(player2[0]).add(player1[1]);
                map.get(player2[0]).add(String.valueOf(duelDifference.multiply(new BigInteger("-1"))));
            }

            inputLine = console.readLine().split("<->");
        }
        TreeMap<BigInteger, String> sortedMap = new TreeMap<>(Collections.reverseOrder());

        for (String s : map.keySet()) {
            BigInteger totalPoints = new BigInteger("0");
            for (int i = 0; i < map.get(s).size(); i++) {
                if (i % 2 != 0){
                    totalPoints = totalPoints.add(new BigInteger(map.get(s).get(i)));
                }
            }
            sortedMap.put(totalPoints, s);
        }


        for (Map.Entry<BigInteger, String> entry : sortedMap.entrySet()) {
            String name = entry.getValue();
            BigInteger points = entry.getKey();
            if (map.containsKey(name)){
                System.out.println(name + " - " + "("+ points +")");
                ArrayList<String> currentDuels = map.get(name);
                for (int i = 0; i < currentDuels.size(); i++) {
                        if (i % 2 == 0){
                            System.out.print("*   " + currentDuels.get(i) + " <-> ");
                        }else {
                            System.out.print(currentDuels.get(i));
                            System.out.println();
                        }
                }

            }
        }
    }
}
