import java.util.Scanner;

/**
 * Created by christian on 16.01.17.
 */
public class ReadInput {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstStr = console.next();
        String secondStr = console.next();
        int firstInt = console.nextInt();
        int secondInt = console.nextInt();
        int thirdInt = console.nextInt();
        String thirdStr = console.next();


        System.out.printf("%s %s %s %d", firstStr, secondStr,thirdStr, (firstInt+secondInt+thirdInt));
    }

}
