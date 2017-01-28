import java.io.*;


public class LineNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        String inputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/input.txt";
        String outputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/output.txt";
        try (BufferedReader in = new BufferedReader(new FileReader(inputPath));
             PrintWriter out = new PrintWriter(new FileWriter(outputPath))){

            String line = in.readLine();
            int coutner = 1;
            while (line != null){
                out.println(coutner + ". " + line);
                coutner++;
                line = in.readLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
