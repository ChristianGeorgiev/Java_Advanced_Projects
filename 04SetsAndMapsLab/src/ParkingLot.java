import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by christian on 24.01.17.
 */
public class ParkingLot {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        HashSet<String> cars = new HashSet<>();
        while (true){
            String[] input = console.nextLine().split(", ");
            if ("END".equals(input[0])){
                break;
            }
            if ("IN".equals(input[0])){
                cars.add(input[1]);
            }else if("OUT".equals(input[0])){
                cars.remove(input[1]);
            }
        }

        if (!cars.isEmpty()){
            for (String car : cars) {
                System.out.println(car);
            }
        }else {
            System.out.println("Parking Lot is Empty");
        }
    }
}
