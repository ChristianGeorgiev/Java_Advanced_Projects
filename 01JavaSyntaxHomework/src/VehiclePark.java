import java.util.ArrayList;
import java.util.Scanner;


public class VehiclePark {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputStr = console.nextLine().split(" ");
        ArrayList<String> carsInStock = new ArrayList<>();

        for (int i = 0; i < inputStr.length; i++) {
            String element = inputStr[i];
            carsInStock.add(element);
        }

        String request = console.nextLine();
        int soldCars = 0;


        while (!request.equals("End of customers!")) {
            String[] requestArr = request.split(" ");
            char requestType = requestArr[0].toLowerCase().charAt(0);
            int requestSeats = Integer.parseInt(requestArr[2]);
            String requestStr = requestType + "" + requestSeats;
            boolean match = false;

            for (int i = 0; i < carsInStock.size(); i++) {
                if (requestStr.equals(carsInStock.get(i))) {
                    match = true;
                    carsInStock.remove(i);
                    soldCars++;
                    break;
                }
            }

            if (match) {
                int price = requestType * requestSeats;
                System.out.printf("Yes, sold for %d$%n", price);
            } else {
                System.out.println("No");
            }


            request = console.nextLine();
        }

        String outputCars = "";
        System.out.print("Vehicles left: ");
        for (String car:carsInStock) {
            outputCars+=" " + car;
//            System.out.print(car+", ");
        }
        System.out.println(outputCars.trim().replaceAll(" ", ", "));
        System.out.println("Vehicles sold: " + soldCars);
    }
}

