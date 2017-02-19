import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class EarthQuake {
    private static ArrayDeque<Integer> allActivities = new ArrayDeque<>();
    private static ArrayDeque<Integer> result = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(console.readLine());
        for (int i = 0; i < n; i++) {
            List<String> inputLine = Arrays.asList(console.readLine().split("\\s+"));
            ArrayDeque<Integer> lineDeque  = new ArrayDeque<>();
            for (String s : inputLine) {
                lineDeque.add(Integer.valueOf(s));
            }
            calculateSeismicities(lineDeque);
        }
//        System.out.println(allActivities);
//        System.out.println(result);

        while (allActivities.size()>0){
            iterateAllActivity(allActivities);
        }

        System.out.println(result.size());
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }




    private static void iterateAllActivity(ArrayDeque<Integer> currentActivity){

        while (currentActivity.size()>0){
            int seismitic = currentActivity.pop();

            if (seismitic < currentActivity.peek()){
                result.add(seismitic);
            }else {
                if (currentActivity.size() == 1){
                    result.add(seismitic);
                    result.add(currentActivity.pop());
                    break;
                }else {
                    result.add(currentActivity.pop());
                }
            }
        }

    }

    private static void calculateSeismicities(ArrayDeque<Integer> activity) {
            int seismitic = activity.pop();

            for (Integer integer : activity) {
                if (seismitic >= integer){
                    activity.pop();
                }else {
                    result.add(seismitic);
                    for (Integer integer1 : activity) {
                        allActivities.add(integer1);
                    }
                    break;
                }
            }
    }
}
