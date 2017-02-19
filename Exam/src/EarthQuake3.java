import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class EarthQuake3 {
    private static ArrayDeque<ArrayDeque<Integer>> allActivities = new ArrayDeque<>();
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
                allActivities.addLast(currentActivity);
            }
        }

        while (allActivities.size()>0){
            ArrayDeque<Integer> currentAct = allActivities.pop();
            if (currentAct.size() == 1){
                result.add(currentAct.peek());
            }
            calculateSeismicities(currentAct);
            if (!currentAct.isEmpty()){
                allActivities.addLast(currentAct);
            }
        }

        System.out.println(result.size());
        for (Integer integer : result) {
            System.out.print(integer + " ");
        }
    }

    private static void calculateSeismicities(ArrayDeque<Integer> activity) {
        int seismitic = activity.pop();

        for (Integer integer : activity) {
            if (seismitic >= integer){
                activity.pop();
            }else {
                result.add(seismitic);
//                for (Integer integer1 : activity) {
//                    allActivities.add(integer1);
//                }
                break;
            }
            if (activity.size()==0){
                result.add(seismitic);
                break;
            }
        }
    }
}
