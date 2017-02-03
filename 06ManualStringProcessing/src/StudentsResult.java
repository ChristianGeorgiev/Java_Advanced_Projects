import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Veronika on 1/31/2017.
 */
public class StudentsResult {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

        int countStudenst=Integer.parseInt(reader.readLine());
        TreeMap<String,List<Double>> result=new TreeMap<>();

        for (int i = 0; i < countStudenst; i++) {
            String[] input=reader.readLine().split("-");
            String name=input[0];
            String[] results=input[1].split(", ");

            List<Double> examResults=new ArrayList<>();
            double avdSum=0;
            for (String res:results ) {
                examResults.add(Double.parseDouble(res));
                avdSum+=Double.parseDouble(res);
            }
            examResults.add(avdSum/3);
            result.put(name,examResults);
        }
        if (!result.isEmpty()){
            System.out.println(String.format("Name      |   JAdv|JavaOOP| AdvOOP|Average|"));
        }


        for (String s :result.keySet()) {
            System.out.println(String.format("%1$-10s|%2$7.2f|%3$7.2f|%4$7.2f|%5$7.4f|",s,result.get(s).get(0),result.get(s).get(1),result.get(s).get(2),result.get(s).get(3)).replace(".",","));
        }
    }
}
