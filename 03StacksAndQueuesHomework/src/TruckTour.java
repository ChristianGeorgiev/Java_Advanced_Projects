import java.util.ArrayDeque;
import java.util.Scanner;

public class TruckTour {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        ArrayDeque<String> pumps = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String pump = console.nextLine();
            pumps.add(pump);
        }

        int pumpCount = 0;
        int tank = 0;
        while (pumps.size()>1){

            String currentPumpStr =pumps.remove();
            String[] currentPump = currentPumpStr.split("\\s+");

            int petrol = Integer.parseInt(currentPump[0]);
            int distance = Integer.parseInt(currentPump[1]);
            tank += petrol - distance;

            if (tank < 0){
                pumps.add(currentPumpStr);
                pumpCount++;
            }
        }
        System.out.println(pumpCount);
    }
}
