import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileNameInConsole { // считывать имена файлов из консоли

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String fileName1;

    {
        try {
            fileName1 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    String fileName2;

    {
        try {
            fileName2 = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    File file1 = new File(fileName1);
    File file2 = new File(fileName2);

}
