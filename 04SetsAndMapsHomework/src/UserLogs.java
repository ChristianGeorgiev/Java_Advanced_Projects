import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String,Integer>> spammers = new TreeMap<>();
        while (true){
            String input = console.nextLine();
            if ("end".equals(input)){
                break;
            }
            String ip = getIp(input);
            LinkedHashMap<String, Integer> temp = new LinkedHashMap<>();
            temp.put(ip,1);
            String user = getUser(input);
            if (!spammers.containsKey(user)){
                spammers.put(user, temp);
            }else {
                if (!spammers.get(user).containsKey(ip)){
                    spammers.get(user).put(ip,1);
                }else {
                    spammers.get(user).put(ip, spammers.get(user).get(ip) + 1);
                }
            }
        }

        for (String spammer : spammers.keySet()) {
            System.out.println(spammer + ": ");
            for (String ip:spammers.get(spammer).keySet()) {
                Set<String> keys = spammers.get(spammer).keySet();
                System.out.print(ip + " => " + spammers.get(spammer).get(ip));

                if (ip.equals(keys.toArray()[keys.toArray().length-1])){
                    //if its the last IP, print "." + new line
                    System.out.print(".");
                    System.out.println();
                }else {
                    System.out.print(", ");
                }
            }
        }
    }


    private static String getIp(String input) {
        String[] arr1 = input.split("=");
        String[] arr2 = arr1[1].split("\\s+");
        return arr2[0];
    }

    private static String getUser(String input) {
        String[] arr1 = input.split("=");
        return arr1[arr1.length-1];
    }




}
