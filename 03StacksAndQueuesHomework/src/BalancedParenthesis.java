import java.util.Scanner;

public class BalancedParenthesis {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        char[] inputCharArr = input.toCharArray();

        if (inputCharArr.length % 2 != 0){
            System.out.println("NO");
            return;
        }


        int length=inputCharArr.length;
        int par1Count = 0;
        int par2Count = 0;
        int par3Count = 0;
        for (int i = 0; i < length ; i++) {
            char currentElement = inputCharArr[inputCharArr.length-1-i];
            if (currentElement==')'){
                currentElement='(';
            }else if(currentElement==']'){
                currentElement='[';
            }
            else if (currentElement=='}') {
                currentElement='{';
            }


            if (currentElement=='('){
                par1Count++;
            }else if(currentElement=='['){
                par2Count++;
            }else if(currentElement=='{'){
                par3Count++;
            }
        }

        if (par1Count%2==0 && par2Count%2==0 && par3Count%2==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
