import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

public class EarthQuake2 {
    private static ArrayDeque<Integer> allActivities = new ArrayDeque<>();
    private static ArrayDeque<Integer> result = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.valueOf(console.readLine());

        for (int i = 0; i < n; i++) {
            String[] line = console.readLine().split(" ");
            ArrayDeque<Integer> currentActivity = new ArrayDeque<>();
            if (!line[0].isEmpty()) {
                for (int j = 0; j < line.length; j++) {
                    currentActivity.add(Integer.valueOf(line[j]));
                }
                calculateSeismicities(currentActivity);
            }
        }

        while (allActivities.size() > 1){
            calculateResult();
        }
        if (allActivities.size()>0) {
            result.add(allActivities.peek());
        }
//        System.out.println(allActivities);
//        System.out.println(result);

        System.out.println(result.size());
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    private static void calculateSeismicities(ArrayDeque<Integer> activity) {
            int seismitic = activity.pop();
            for (Integer integer : activity) {
                if (seismitic >= integer){
                    activity.pop();
                }else {
                    result.add(seismitic);

                    for (Integer integer1 : activity) {
                        allActivities.addLast(integer1);
                    }
                    break;
                }
            }
    }

    private static void calculateResult(){
        int first = allActivities.pop();
        if (first >= allActivities.peek()){
            allActivities.pop();
        }else {
            result.add(first);
            int temp = allActivities.pop();
            allActivities.addLast(temp);
        }
    }
}
