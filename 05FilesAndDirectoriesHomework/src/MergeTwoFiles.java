import java.io.*;

public class MergeTwoFiles {
    public static void main(String[] args) {
        String firstFilePath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/words.txt";
        String secondFilePath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/text.txt";

        String outputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/result.txt";
        try (BufferedReader inFirst = new BufferedReader(new FileReader(firstFilePath));
             BufferedReader inSecond = new BufferedReader(new FileReader(secondFilePath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))){

            String firstLine = inFirst.readLine();
            while (firstLine != null){
                out.println(firstLine);
                firstLine = inFirst.readLine();
            }
            String secondLine = inSecond.readLine();

            while (secondLine != null){
                out.println(secondLine);
                secondLine = inSecond.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
