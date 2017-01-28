
import java.util.Scanner;

public class GameOfNames {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        short n = Short.parseShort(console.nextLine());

        String winnerName = "";
        int winnerPoints = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String nameStr = console.nextLine();
            int points = Integer.parseInt(console.nextLine());
            char[] nameChar = nameStr.toCharArray();

            for (int j = 0; j < nameChar.length; j++) {
                int currentLetter = nameChar[j];
                if (currentLetter%2==0){
                    points+=currentLetter;
                }else{
                    points-=currentLetter;
                }
            }
            if (points>winnerPoints){
                winnerName = nameStr;
                winnerPoints = points;
            }
        }
        System.out.printf("The winner is %s - %d points", winnerName, winnerPoints);
    }
}
