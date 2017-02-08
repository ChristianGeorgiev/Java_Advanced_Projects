import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MelrahShake {
        public static void main(String[] args) throws IOException {
            BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
            String input = scanner.readLine();
            String pattern = scanner.readLine();
            StringBuilder sb = new StringBuilder();
            StringBuilder sbPattern = new StringBuilder();
            sbPattern.append(pattern);
            sb.append(input);

            while(sbPattern.length() > 0){
                int index = sb.indexOf(sbPattern.toString());
                if(index != -1){
                    StringBuilder temp = new StringBuilder();
                    temp.append(sb);
                    temp.delete(index, index + sbPattern.length());
                    int lastIndex = temp.lastIndexOf(sbPattern.toString());
                    if(lastIndex != -1){
                        temp.delete(lastIndex, lastIndex + sbPattern.length());
                        System.out.println("Shaked it.");
                        sb = temp;
                        int patternIndex = sbPattern.length()/2;
                        sbPattern.deleteCharAt(patternIndex);
                        continue;

                    }
                    else{
                        break;
                    }
                }
                else{
                    break;
                }
            }
            System.out.println("No shake.");
            System.out.println(sb.toString());


        }
}
