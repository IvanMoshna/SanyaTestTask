import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {

    public File getFileFromPath(String pathToFile) {
        //TODO: проверить, что файл существует
        File file = new File(pathToFile);
        boolean isExist = file.exists();
        if (isExist) {
            return file;
        } else {
            return null;
        }
    }

    public File createFile(String pathToFile) throws IOException {
        File file = new File(pathToFile);
        file.createNewFile();
        return file;
    }

    public void copyFileContent(String pathFileFrom, String pathFileTo) throws IOException {
        Files.copy(Paths.get(pathFileFrom), new FileOutputStream(pathFileTo));
    }
}
