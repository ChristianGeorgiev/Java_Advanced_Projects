import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;

public class JediMeditation2 {
    public static void main(String[] args) throws IOException{
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.valueOf(console.readLine());
        Deque<String> masters = new ArrayDeque<>();
        Deque<String> knights = new ArrayDeque<>();
        Deque<String> padawans = new ArrayDeque<>();
        Deque<String> toshkoSlav = new ArrayDeque<>();
        boolean yoda = false;
        for (int i = 0; i < n; i++) {
            String[] line = console.readLine().split(" ");
            for (int j = 0; j < line.length; j++) {
                switch (line[j].charAt(0)){
                    case 'm':
                        masters.addLast(line[j]);
                        break;
                    case 'k':
                        knights.addLast(line[j]);
                        break;
                    case 'p':
                        padawans.addLast(line[j]);
                        break;
                    case 't':
                        toshkoSlav.addLast(line[j]);
                        break;
                    case 's':
                        toshkoSlav.addLast(line[j]);
                    default: break;
                }
                if (line[j].charAt(0) == 'y'){
                    yoda = true;
                }
            }
        }

        Deque<String> result = new ArrayDeque<>();
        StringBuilder resultSb = new StringBuilder();
        String debug = "";
        if (yoda){
            resultSb.append(String.join(" ", masters)).append(" ");
            resultSb.append(String.join(" ", knights)).append(" ");
            resultSb.append(String.join(" ", toshkoSlav)).append(" ");
            resultSb.append(String.join(" ", padawans)).append(" ");
//            result.addAll(masters);
//            result.addAll(knights);
//            result.addAll(toshkoSlav);
//            result.addAll(padawans);
        }else {
            resultSb.append(String.join(" ", toshkoSlav)).append(" ");
            resultSb.append(String.join(" ", masters)).append(" ");
            resultSb.append(String.join(" ", knights)).append(" ");
            resultSb.append(String.join(" ", padawans)).append(" ");
//            result.addAll(toshkoSlav);
//            result.addAll(masters);
//            result.addAll(knights);
//            result.addAll(padawans);
        }

        System.out.println(resultSb);
//        while (!result.isEmpty()){
//            System.out.print(result.remove() + " ");
//        }

    }
}
