import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SumLines {
    public static void main(String[] args) throws FileNotFoundException{
        String inputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/input.txt";
        Scanner reader = new Scanner(new FileReader(inputPath));

        while (reader.hasNext()){
            int lineSum = 0;
            char[] inputLine = reader.nextLine().toCharArray();
            for (int i = 0; i < inputLine.length; i++) {
                lineSum+=inputLine[i];
            }
            System.out.println(lineSum);
        }
    }
}
