import java.io.*;

public class AllCapital {
    public static void main(String[] args) throws IOException{

    String inputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/input.txt";
    String outputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/output.txt";

        BufferedReader in = new BufferedReader(new FileReader(inputPath));
        PrintWriter out = new PrintWriter(new FileWriter(outputPath));
        String line = in.readLine();

        while (line != null){
            out.write(line.toUpperCase());
            line = in.readLine();
        }
    }
}
