import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = console.nextInt();
        double b = console.nextDouble();
        double c = console.nextDouble();


        char[] hexiA = Integer.toHexString(a).toUpperCase().toCharArray();

        String binaryA = Integer.toBinaryString(a);

        char[] hexiArr = new char[10];
        char[] binaryArr = new char[10];

        if (hexiA.length < hexiArr.length){
            for (int i = 0; i < hexiA.length; i++) {
                hexiArr[i] = hexiA[i];
            }
            for (int i = hexiA.length; i < hexiArr.length; i++) {
                hexiArr[i]=' ';
            }
        }else{
            for (int i = 0; i < hexiArr.length; i++) {
                hexiArr[i] = hexiA[i];
            }
        }

        String binaryStringA = String.format("%0"+(10-binaryA.length())+"d%s", 0, binaryA);

        //Left padding
        String formatedB = String.format("%.2f", b);
        String firstDecimal = String.format("%10s", formatedB).replace(' ',' ');

        //Right padding
        String formatedC = String.format("%.3f", c);
        String secondDecimal = String.format("%-10s", formatedC).replace(' ',' ');

        System.out.print("|");
        for (int i = 0; i < hexiArr.length; i++) {
            System.out.print(hexiArr[i]);
        }
        System.out.printf("|%s|%s|%s|", binaryStringA, firstDecimal, secondDecimal);
        System.out.println();
    }
}
