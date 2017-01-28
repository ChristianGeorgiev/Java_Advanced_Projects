import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int kilometers = console.nextInt();
        String dayTime = console.next();

        double total = 0.0;
        if (kilometers<20){
            if (dayTime.equals("day")){
                total=(kilometers*0.79) + 0.70;
            } else{
                total=(kilometers*0.90) + 0.70;
            }
        }

        if (kilometers >=20 && kilometers<100){
            total=kilometers*0.09;
        }else if(kilometers>=100){
            total=kilometers*0.06;
        }

        System.out.printf("%.2f", total);

    }
}
