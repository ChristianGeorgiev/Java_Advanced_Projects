import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class CubicArtilerry {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int bunkerCapacity = Integer.valueOf(console.readLine());
        String[] inputLine = console.readLine().split("\\s+");


        LinkedHashMap<String, LinkedList<Integer>> map = new LinkedHashMap<>();
        while (!("Bunker".equals(inputLine[0])) && !("Revision".equals(inputLine[1]))){
            LinkedList<String> bunkers = new LinkedList<>();
            LinkedList<Integer> weapons = new LinkedList<>();

            for (int i = 0; i < inputLine.length; i++) {
                if (isInteger(inputLine[i])){
                    weapons.add(Integer.valueOf(inputLine[i]));
                }else {
                    bunkers.addLast(inputLine[i]);
                }
            }
            LinkedList<Integer> weaponsLeft = new LinkedList<>();

            for (String bunker : bunkers) {
                int currentBunkerSum = 0;
                LinkedList<Integer> currentBunkerWeapons = new LinkedList<>();

                while (currentBunkerSum <= bunkerCapacity){
                    try {
                        if ((currentBunkerSum + weapons.peek()) <= bunkerCapacity) {
                            int currentWeapon = weapons.pop();
                            currentBunkerSum += currentWeapon;
                            currentBunkerWeapons.add(currentWeapon);
                        }
                        if (weapons.peek() > currentBunkerWeapons.peek()
                                && currentBunkerSum-weapons.peek()<=bunkerCapacity){

                                int weaponToRemove = currentBunkerWeapons.peek();
                                currentBunkerSum -= weaponToRemove;
                                currentBunkerWeapons.add(weapons.pop());
                        }else {
                            break;
                        }
                    }catch (Exception e){
                        break;
                    }
                }
                map.put(bunker, currentBunkerWeapons);
            }


            bunkers = new LinkedList<>();
            weapons = new LinkedList<>();
            inputLine = console.readLine().split("\\s+");
        }
        printMap(map);


    }






    private static void printMap (LinkedHashMap<String,LinkedList<Integer>> map){
        for (String s : map.keySet()) {
            System.out.print(s + " -> ");
            for (int i = 0; i < map.get(s).size(); i++) {
                System.out.print(map.get(s).get(i) + " ");
            }
            System.out.println();
        }
    }
    private static boolean isInteger (String s){
        try {
            int n = Integer.valueOf(s);
            return true;
        }catch (Exception e){
            return false;
        }
    }
    //            while (true) {
//                if (weaponsSum <= bunkerCapacity) {
//                    map.put(bunker, weapons);
//                    break;
//                } else {
//                    ArrayList<Integer> temp = new ArrayList<>();
//                    temp.addAll(weapons);
//                    for (int i = 0; i < temp.size(); i++) {
//                        if (temp.get(i) > bunkerCapacity){
//                            weapons.remove(temp.get(i));
//                        }
//                    }
//                    weaponsSum = weaponsSum - weapons.getFirst();
//                }
//            }
}
