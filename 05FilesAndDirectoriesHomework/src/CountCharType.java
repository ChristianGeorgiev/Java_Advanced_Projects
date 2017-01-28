import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class CountCharType {
    public static void main(String[] args) {

        String inputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/input.txt";
        String outputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/output.txt";
        ArrayList<Character> vowels = new ArrayList<>();
        Collections.addAll(vowels, 'a','e','i','o','u');
        ArrayList<Character> punctuation = new ArrayList<>();
        Collections.addAll(punctuation, '.',',','!','?');
        try(
                BufferedReader in = new BufferedReader(new FileReader(inputPath));
                PrintWriter out = new PrintWriter(new FileOutputStream(outputPath))){
            String line = in.readLine();

            int vowelsCount = 0;
            int consonantsCount = 0;
            int punctuationCount = 0;
            while (line != null){
                char[] inputLine = line.toLowerCase().toCharArray();
                for (int i = 0; i < inputLine.length; i++) {
                    if (vowels.contains(inputLine[i])){
                        vowelsCount++;
                    }else if(punctuation.contains(inputLine[i])){
                        punctuationCount++;
                    }else if (inputLine[i]!=' '){
                        consonantsCount++;
                    }
                }
                line=in.readLine();
            }
            out.println("Vowels: " + vowelsCount);
            out.println("Consonants: " + consonantsCount);
            out.println("Punctuation: " + punctuationCount);
        }catch (IOException e){
                    e.printStackTrace();
        }


    }
}
