import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JediMeditation {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(console.readLine());

        StringBuilder masters = new StringBuilder();
        StringBuilder knights = new StringBuilder();
        StringBuilder padawans = new StringBuilder();
        StringBuilder toshkoSlav = new StringBuilder();

        StringBuilder jedis = new StringBuilder();
        for (int i = 0; i < n; i++) {
            jedis.append(console.readLine() + " ").trimToSize();
        }

        String[] allJedis = jedis.toString().trim().split("\\s+");
        Boolean yoda = false;
        for (int i = 0; i < jedis.length()-1; i++) {
            if (jedis.charAt(i) == 'm'){
                masters.append(jedis.substring(i, i+2) + " ");
            }else if (jedis.charAt(i) == 'k'){
                knights.append(jedis.substring(i,i+2) + " ");
            }else if (jedis.charAt(i) == 'p'){
                padawans.append(jedis.substring(i,i+2) + " ");
            }else if (jedis.charAt(i) == 't' || jedis.charAt(i) == 's'){
                toshkoSlav.append(jedis.substring(i, i+2) + " ");
            }
        }
        if (jedis.toString().contains("y")){
            yoda = true;
        }


        if (yoda){
            System.out.println(masters.toString() + knights.toString() + toshkoSlav.toString() + padawans.toString());
        }else {
            System.out.println(toshkoSlav.toString() + masters.toString() + knights.toString() +  padawans.toString());
        }
    }
}
