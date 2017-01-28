import java.util.*;


public class Robotics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] robotsStr = console.nextLine().split(";");
        String[] startingTime = console.nextLine().split(":");
        ArrayDeque<String> products = new ArrayDeque<>();

        String product = console.nextLine();
        while (!product.equals("End")){
            products.add(product);
            product = console.nextLine();
        }

        while (products.size()>0){
            int secondsCounter = 1;
        }
    }
}
