package questionThreeAndFour;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MyThread {
    public static void main(String[] args) throws IOException {
        FolderSize folderSize = new FolderSize();
        File file = new File("E:\\drive D\\q");
        List<File> filesList = folderSize.folders(file);
        long totalSize = 0;
        for (File file1:filesList) {
            totalSize += file1.length();
        }
        System.out.println(totalSize);
    }
}