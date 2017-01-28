import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReadAFile {
    public static void main(String[] args) {
        String inputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/input.txt";
        String outputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/output.txt";

        List<Character> punctuation = new ArrayList<>();
        Collections.addAll(punctuation, '.',',','!','?');
        try (FileInputStream in = new FileInputStream(inputPath);OutputStream out = new FileOutputStream(outputPath)){

            int oneByte = 0;
            while ((oneByte = in.read()) >= 0) {
                if (!punctuation.contains((char)oneByte)){
                    out.write(oneByte);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
