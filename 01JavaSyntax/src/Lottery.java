/**
 * Created by christian on 16.01.17.
 */
public class Lottery {
    public static void main(String[] args) {
        for (int n1 = 1; n1 <=10; n1++) {
            for (int n2 = n1+1; n2 <= 10; n2++) {
                for (int n3 = n2+1; n3 <= 10 ; n3++) {
                    System.out.printf("%d %d %d",n1,n2,n3);
                    System.out.println();
                }
            }
        }
    }
}