import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner in = new Scanner(System.in);
        FileService fileService = new FileService();
        Application application = new Application(in, fileService);
        application.start();
    }



        /*FileService fileService = new FileService();
        File f = fileService.getFileFromPath(subStr[0]);
        if(f==null){
            System.out.println("File is null");
        }

        //System.out.println(f.getName());
        //fileService.createFile();
        fileService.copyFileContent("C:\\Users\\moshn\\Downloads\\Telegram Desktop\\TestTask\\TestTask\\src\\main\\resources\\in1.txt",
                "C:\\Users\\moshn\\Downloads\\Telegram Desktop\\TestTask\\TestTask\\src\\main\\resources\\out.txt");*/




}
