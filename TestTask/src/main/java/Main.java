import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        boolean isTypeSelected = false;
        boolean isSortingSelected = false;

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


        for (int i=0; i < subStr.length; i++) {
            if(subStr[i].substring(0, 1).equals("-")) {
                if (subStr[i].length() > 2) {
                    System.out.println("Команда введена неверно, попробуйте еще раз");
                    //TODO: по новой запускать, подумать как сделать.
                } else {
                    switch (subStr[i].substring(1, 2)) {
                        case "i":
                            if(!isTypeSelected) {
                                System.out.println("Пацаны тут интов нам привезли");
                                isTypeSelected=true;
                                break;
                            } else {
                                System.out.println("Ты по-моему что-то перепутал");
                                //TODO: запускай по новой
                                break;
                            }
                        case "s":
                            if(!isTypeSelected) {
                                System.out.println("Разгружай вагон со стрингами");
                                isTypeSelected=true;
                                break;
                            } else {
                                System.out.println("Ты по-моему что-то перепутал");
                                //TODO: запускай по новой
                                break;
                            }
                        case "a":
                            if(!isSortingSelected) {
                                System.out.println("Давай вира");
                                isSortingSelected=true;
                                break;
                            } else {
                                System.out.println("Ты по-моему что-то перепутал");
                                //TODO: запускай по новой
                                break;
                            }
                        case "d":
                            if(!isSortingSelected) {
                                System.out.println("Майна, майна!");
                                isSortingSelected=true;
                                break;
                            } else {
                                System.out.println("Ты по-моему что-то перепутал");
                                //TODO: запускай по новой
                                break;
                            }
                    }
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
