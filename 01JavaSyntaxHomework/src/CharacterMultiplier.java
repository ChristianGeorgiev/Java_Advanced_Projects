import java.util.Scanner;


public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char[] string1 = console.next().toCharArray();
        char[] string2 = console.next().toCharArray();

        int minLength = Math.min(string1.length, string2.length);

        int sum = 0;

        for (int i = 0; i < minLength; i++) {
            sum += string1[i] * string2[i];
        }

        if (string1.length>string2.length){
          int index = string2.length;
            for (int i = index; i < string1.length; i++) {
                sum+= string1[i];
            }
        }else if (string2.length>string1.length){
            int index = string1.length;
            for (int i = index; i < string2.length ; i++) {
                sum+= string2[i];
            }
        }

        System.out.println(sum);
    }
}
