import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //chitaem s konsoli adress
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of directory: ");

        //path - to chto vveli s konsoli
        String path = in.nextLine();
        in.close();

        //teper eto nuzno rasparsit
        //delim po probelu
        String[] subStr;
        subStr = path.split(" ");

 /*       for (int i=0; i < subStr.length; i++) {
            System.out.println(i + " " + subStr[i]);
        }*/

        //s4itaem chto
        //0 - eto sort.exe
        //1 - flag
        //ot 2 do n - puti
        FileService fileService = new FileService();
        File f = fileService.getFileFromPath(subStr[0]);
        if(f==null){
            System.out.println("File is null");
        }

        //System.out.println(f.getName());
        //fileService.createFile();

    }


}
