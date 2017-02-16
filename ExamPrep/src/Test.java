import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        TreeMap<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();
        LinkedHashMap<String, Integer> input = new LinkedHashMap<>();
        input.put("Red", 20);
        input.put("Green", 22);
        input.put("Blue", 10);
        map.put("Sofia", input);

        LinkedHashMap<String, Integer> input2 = new LinkedHashMap<>();
        input2.put("Red", 30);
        input2.put("Green", 13);
        input2.put("Blue", 25);
        map.put("Varna", input2);


        for (String s : map.keySet()) {
            LinkedHashMap<String, Integer> temp = map.get(s);
            LinkedHashMap<String, Integer> result = new LinkedHashMap<>();

            TreeSet<Integer> sortedValues = new TreeSet<>();
            for (Integer integer : temp.values()) {
                sortedValues.add(integer);
            }

            Integer[] tempArr = new Integer[sortedValues.size()];
            ArrayList<Integer> sortedList = new ArrayList<>();
            sortedList.addAll(sortedValues);
            for (int i = 0; i < tempArr.length; i++) {
                tempArr[i] = sortedList.get(sortedList.size()-1-i);
            }

            LinkedHashSet<Integer> set = new LinkedHashSet<>();
            for (Integer integer : tempArr) {
                set.add(integer);
            }

            for (Integer sortedValue : set) {
                for (String key : temp.keySet()) {
                    if (sortedValue == temp.get(key)){
                        result.put(key, sortedValue);
                    }
                }
            }
            map.put(s, result);
        }



        for (String s : map.keySet()) {
            System.out.println(s + ": ");
            for (String insideMap : map.get(s).keySet()) {
                System.out.println(insideMap + " -> " + map.get(s).get(insideMap));
            }
        }

    }

}
