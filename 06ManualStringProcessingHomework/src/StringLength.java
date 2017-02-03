import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringLength {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String input = console.readLine();

        char[] tempArr = input.toCharArray();
        char[] outputArr = new char[20];
        for (int i = 0; i < Math.min(outputArr.length, tempArr.length); i++) {
            outputArr[i] = tempArr[i];
        }
        if (tempArr.length<outputArr.length){
            for (int i = 0; i < outputArr.length-tempArr.length; i++) {
                outputArr[outputArr.length-1-i] = '*';
            }
        }

        for (int i = 0; i < outputArr.length; i++) {
            System.out.print(outputArr[i]);
        }
    }
}
