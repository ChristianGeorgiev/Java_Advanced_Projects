import sun.reflect.generics.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class JediDreams2 {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        //method names - static [\w\s]+[A-za-z]+
        //method calls - (\.[\w\s]+[A-za-z]+|([A-Z][A-Za-z]+)\(.+\);)

        int n = Integer.valueOf(console.readLine());
        Pattern methodNamesPattern = Pattern.compile("static [\\w\\s]+[A-za-z]+");
        Pattern methodCallsPattern = Pattern.compile("(\\.[\\w\\s]+[A-za-z]+|([A-Z][A-Za-z]+)\\(.+\\);)");
        TreeMap<String, ArrayList<String>> result = new TreeMap<>();

        StringBuilder code = new StringBuilder();
        for (int i = 0; i < n; i++) {
            code.append(console.readLine()).append(System.getProperty("line.separator"));
        }


        Matcher namesMatcher = methodNamesPattern.matcher(code);
        int counter = 0;
        List<String> names = new ArrayList<>();
        List<Integer> indexes = new ArrayList<>();
        LinkedHashMap<String, Integer> sorted = new LinkedHashMap<>();
            while (namesMatcher.find()){
                String[] match = namesMatcher.group().split("\\s+");
                int index = code.indexOf(namesMatcher.group());
                names.add(match[match.length-1]);
                indexes.add(index);
                sorted.put(match[match.length-1], index);
            }



        for (String s : sorted.keySet()) {
            System.out.println(s + " -> " + sorted.get(s).toString());
        }



//        for (int i = 0; i < indexes.size(); i++) {
//            String line = "";
//            ArrayList<String> temp = new ArrayList<>();
//            if (i < indexes.size()-1){
//               line = code.substring(indexes.get(i), indexes.get(i+1));
//            }else {
//                line = code.substring(indexes.get(i));
//            }
//            Matcher callMatcher = methodCallsPattern.matcher(line);
//            while (callMatcher.find()){
//                StringBuilder reminder = new StringBuilder(callMatcher.group());
//                if (reminder.charAt(0) == '.'){
//                    if (!reminder.toString().equals(".Length")) {
//                        temp.add(reminder.deleteCharAt(0).toString());
//                    }
//                    // SKETCHY AS FUCK ^
//                }else {
//                    String[] matchArr = reminder.toString().split("\\(");
//                    temp.add(matchArr[0]);
//                }
//            }
//            Collections.sort(temp);
//            result.put(names.get(i), temp);
//        }
        String debug = "";
    }

}

