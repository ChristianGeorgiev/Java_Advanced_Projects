import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.TreeSet;

public class Palindromes {
    public static void main(String[] args) throws IOException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        String[] text = console.readLine().split("[\\p{Punct}\\s+]");
        TreeSet<String> palindromes = new TreeSet<>();
        for (String s : text) {
            char[] temp = s.toCharArray();
            boolean isPalindrome = false;
            for (int i = 0; i < temp.length; i++) {
                if (temp[i] == temp[temp.length-1-i]){
                    isPalindrome = true;
                }else {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome){
                palindromes.add(s);
            }
        }

        System.out.println(palindromes.toString());
    }
}
