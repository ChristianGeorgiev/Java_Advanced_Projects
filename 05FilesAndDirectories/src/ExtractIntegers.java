import java.util.Scanner;
import java.io.*;

public class ExtractIntegers{
    public static void main (String[] args) throws FileNotFoundException{
        String inputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/input.txt";
        String outputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/output.txt";

        Scanner scanner = new Scanner(new FileInputStream(inputPath));
        PrintWriter out = new PrintWriter(new FileOutputStream(outputPath));

        while (scanner.hasNext()){
            if (scanner.hasNextInt()){
                out.println(scanner.nextInt());
            }
            scanner.next();
        }

    }
}




