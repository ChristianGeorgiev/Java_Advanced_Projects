import java.util.Scanner;

/**
 * Created by christian on 17.01.17.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int ax = console.nextInt();
        int ay = console.nextInt();

        int bx = console.nextInt();
        int by = console.nextInt();

        int cx = console.nextInt();
        int cy = console.nextInt();

        int area = Math.abs((ax*(by-cy) + bx*(cy-ay) + cx*(ay-by))/2);
        System.out.println();
        if (area==0){
            System.out.println("0");
        }else{
            System.out.printf("%d", area);

        }

    }
}
