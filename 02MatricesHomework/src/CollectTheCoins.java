import java.util.Scanner;

public class CollectTheCoins {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char[][] board = new char[4][];
        for (int i = 0; i < board.length; i++) {
            board[i] = console.nextLine().toCharArray();
        }
        char[] commands = console.nextLine().toCharArray();

        int x = 0;
        int y = 0;
        int coins = 0;
        int walls = 0;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]){
                case 'V':
                    int temp = x+1;
                    if (temp<4 && y < board[temp].length){
                        x = temp;
                        if (board[x][y] == '$'){
                            coins++;
                        }
                    }else{
                        walls++;
                    }
                    break;


                case '^':
                    temp = x-1;
                    if (temp>=0){
                        x=temp;
                        if (board[x][y] == '$'){
                            coins++;
                        }
                    }else {
                        walls++;
                    }
                    break;

                case '>':
                    temp = y+1;
                    if (temp<board[x].length){
                        y = temp;
                        if (board[x][y] == '$'){
                            coins++;
                        }
                    }else {
                        walls++;
                    }
                    break;

                case '<':
                    temp=y-1;
                    if (temp>=0){
                        y = temp;
                        if (board[x][y] == '$'){
                            coins++;
                        }
                    }else {
                        walls++;
                    }
                    break;
            }
        }

        System.out.println("Coins = " + coins);
        System.out.println("Walls = " + walls);
    }
}
