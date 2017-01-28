import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class ReadFile {
    public static void main(String[] args) {
        String inputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/input.txt";


        try (FileInputStream in = new FileInputStream(inputPath)) {
            int oneByte = in.read();
            while (oneByte >= 0) {
                System.out.printf("%s ", Integer.toBinaryString(oneByte));
                oneByte = in.read();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
