import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.LinkedHashMap;

public class WordCount {
    public static void main(String[] args) {

        String firstFilePath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/words.txt";
        String secondFilePath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/text.txt";

        String outputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/result.txt";
        try (BufferedReader inFirst = new BufferedReader(new FileReader(firstFilePath));
             BufferedReader inSecond = new BufferedReader(new FileReader(secondFilePath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))){
            String[] firstFileWords = inFirst.readLine().split(" ");
            String[] secondFileWords = inSecond.readLine().split(" ");
            for (int i = 0; i < firstFileWords.length; i++) {
                int count = 0;
                for (int j = 0; j < secondFileWords.length; j++) {
                    if (firstFileWords[i].equals(secondFileWords[j])){
                        count++;
                    }
                }
                if (count > 0){
                    out.println(firstFileWords[i] + " - " + count);
                }
            }
        }catch (IOException e){
                 e.printStackTrace();
        }
    }
}
