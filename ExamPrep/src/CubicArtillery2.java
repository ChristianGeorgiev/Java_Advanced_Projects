import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class CubicArtillery2 {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));


        int bunkerCapacity = Integer.valueOf(console.readLine());
        String[] inputLine = console.readLine().split("\\s+");

        LinkedList<String> bunkers = new LinkedList<>();
        LinkedList<Integer> weapons = new LinkedList<>();
        LinkedHashMap<String, LinkedList<Integer>> map = new LinkedHashMap<>();

        while (!("Bunker".equals(inputLine[0])) && !("Revision".equals(inputLine[1]))) {

            for (int i = 0; i < inputLine.length; i++) {
                if (isInteger(inputLine[i])) {
                    weapons.addLast(Integer.valueOf(inputLine[i]));
                } else {
                    bunkers.addLast(inputLine[i]);
                }
            }
            inputLine = console.readLine().split("\\s+");
        }

        for (String bunker : bunkers) {
            LinkedList<Integer> currentWeapons = new LinkedList<>();
            int currentSum = 0;

            while (true) {
                if (weapons.size()>0) {
                    if (currentSum <= bunkerCapacity && weapons.peek() <= bunkerCapacity
                            && (weapons.peek()+currentSum) <= bunkerCapacity) {

                            int currentWeapon = weapons.pop();
                            currentSum += currentWeapon;
                            currentWeapons.add(currentWeapon);
                            if (weapons.size() > 0 && currentWeapons.size() > 0) {
                                if (weapons.peek() <= bunkerCapacity) {
                                    while (true) {


                                        if (weapons.peek() + currentSum > bunkerCapacity) {
                                            while (currentSum + weapons.peek() >= bunkerCapacity) {
                                                int removedWeapon = currentWeapons.pop();
                                                weapons.add(removedWeapon);
                                                currentSum -= removedWeapon;
                                            }
                                        }


                                        else {
                                            int weaponToAdd = weapons.pop();
                                            if (currentSum + weaponToAdd <= bunkerCapacity) {
                                                currentWeapons.add(weaponToAdd);
                                                currentSum += weaponToAdd;
                                                break;
                                            }
                                        }

                                    }
                                }
                            }
                    } else {
                        if (weapons.peek()>bunkerCapacity){

                            weapons.pop();
                        }
                        break;
                    }
                }else {
                    break;
                }
            }


            map.put(bunker, currentWeapons);
        }


        printMap(map);








//        for (Integer weapon : weapons) {
//            System.out.print(weapon + " ");
//        }
//        System.out.println();
//        for (String bunker : bunkers) {
//            System.out.print(bunker + " ");
//        }
    }

    private static void printMap (LinkedHashMap<String,LinkedList<Integer>> map){
        for (String s : map.keySet()) {
            System.out.print(s + " -> ");
            for (int i = 0; i < map.get(s).size(); i++) {
                System.out.print(map.get(s).get(i) + ", ");
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
}
