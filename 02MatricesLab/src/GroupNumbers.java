import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by christian on 17.01.17.
 */
public class GroupNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String[] inputStr = console.nextLine().split(", ");
        int[] inputInt = new int[inputStr.length];
        for (int i = 0; i < inputStr.length; i++) {
            inputInt[i] = Integer.parseInt(inputStr[i]);
        }

        ArrayList<ArrayList<Integer>> jmatrix = new ArrayList<>();
        jmatrix.add(0, new ArrayList<Integer>());
        jmatrix.add(1, new ArrayList<Integer>());
        jmatrix.add(2, new ArrayList<Integer>());

        for (int i = 0; i < inputInt.length; i++) {
            if (Math.abs(inputInt[i]) % 3 == 0){
                jmatrix.get(0).add(inputInt[i]);
            }else if (Math.abs(inputInt[i]) % 3 == 1){
                jmatrix.get(1).add(inputInt[i]);
            }else if (Math.abs(inputInt[i]) % 3 == 2){
                jmatrix.get(2).add(inputInt[i]);
            }
        }

        for (int i = 0; i < jmatrix.size(); i++) {
            for (int j = 0; j < jmatrix.get(i).size(); j++) {
                System.out.printf("%d ", jmatrix.get(i).get(j));
            }
            System.out.println();
        }
    }
}
