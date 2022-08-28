import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileService {

    public File getFileFromPath(String pathToFile) {
        //TODO: proverit' chto file syshestvuet
        File file = new File(pathToFile);
        boolean isExist = file.exists();
        if (isExist) {
            return file;
        } else {
            return null;
        }
    }

    public File createFile() throws IOException {
        File file = new File("C:\\Users\\moshn\\Downloads\\Telegram Desktop\\TestTask\\TestTask\\src\\main\\resources", "out.txt");
        file.createNewFile();
        return file;
    }

    public void copyFileContent(File fileFrom, File fileTo) throws IOException {
        Files.copy(Paths.get(fileFrom.getPath()), new FileOutputStream(fileTo));
    }
}
