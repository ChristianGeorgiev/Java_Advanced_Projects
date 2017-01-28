import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {
        String inputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/input.txt";
        String outputPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/output.txt";

        try (FileInputStream in = new FileInputStream(inputPath); OutputStream out = new FileOutputStream(outputPath)){
            int oneByte =0;
            while ((oneByte = in.read()) >= 0){
                if (oneByte == 10 || oneByte == 32){
                    out.write(oneByte);
                }else {
                    String digits = String.valueOf(oneByte);
                    for (int i = 0; i < digits.length(); i++) {
                        out.write(digits.charAt(i));
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
