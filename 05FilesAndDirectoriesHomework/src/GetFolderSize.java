import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String fuckingPath = "/home/christian/Desktop/SoftUni/Java Advanced/05.Files and Directories/Homework/FuckingFolder";
        File fuckingFolder = new File(fuckingPath);
        System.out.println(fuckingFolder.length());
    }
}
