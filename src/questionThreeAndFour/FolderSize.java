package questionThreeAndFour;

import java.io.File;
import java.util.List;

public class FolderSize {
    public List<File> folders(File folder) {
        if (folder.isDirectory()) {
            List<File> files = List.of(folder.listFiles());
            return files;
        }
        return null;
    }
}

