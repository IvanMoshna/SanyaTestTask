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


        //TODO: напиздел я сам себе, короче когда парсим, нужно смотреть первый символ, если это "-", значит это флаг, если не минус, значит путь,
        //потому что 2 флага может идти подряд
        //может, конечно, есть какие то более логичные и лучше работающие способы, но на ум сразу только такая идея пришла.
        //плюс это тестовое на курсы блять, чо они хотят, файл считал и заебись.

        //TODO: тут еще можно смотреть, что скажем у нас всего одна буква, если больше, то писать, шо Миша все хуйня, давай по новой
        for (int i=0; i < subStr.length; i++) {
            if(subStr[i].substring(0, 1).equals("-")){
                switch (subStr[i].substring(1, 2)){
                    case "i":
                        System.out.println("Пацаны тут интов нам привезли");
                        break;
                    case "s":
                        System.out.println("Разгружай вагон со стрингами");
                        break;
                    case "a":
                        System.out.println("Давай вира");
                        break;
                    case "d":
                        System.out.println("Майна, майна!");
                        break;
                }
            }
        }



        FileService fileService = new FileService();
        File f = fileService.getFileFromPath(subStr[0]);
        if(f==null){
            System.out.println("File is null");
        }

        //System.out.println(f.getName());
        //fileService.createFile();
        fileService.copyFileContent("C:\\Users\\moshn\\Downloads\\Telegram Desktop\\TestTask\\TestTask\\src\\main\\resources\\in1.txt",
                "C:\\Users\\moshn\\Downloads\\Telegram Desktop\\TestTask\\TestTask\\src\\main\\resources\\out.txt");

    }


}
