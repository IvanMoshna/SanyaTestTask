import java.io.IOException;
import java.util.Scanner;

public class Application {
    final Scanner scanner;
    final FileService fileService;

    public Application(Scanner scanner, FileService fileService) {
        this.scanner = scanner;
        this.fileService = fileService;
    }

    public void start() throws IOException {
        System.out.print("Введи команды и адреса файлов: ");


        //path - читаем, что с консоли ввели
        String path = scanner.nextLine();
        //in.close();//TODO:не забыть потом закрыть
        //далее парсим это безобразие
        String[] subStr;
        subStr = path.split(" ");

        int flagLength = checkFlags(subStr);

        //если флаги выставлены, создаем файлы
        if(subStr.length>flagLength) {
            fileService.createFile(subStr[flagLength]); //первый файл куда копировать все будем
            for (int i = flagLength; i<subStr.length; i++) {
                fileService.getFileFromPath(subStr[i]);
            }
        }

        //TODO: файлы созданы, осталось все скопировать и отсортировать.

        //TODO: ну и придумать как можно наебнуть все, чтобы написать сюда проверок

    }

    private int checkFlags(String[] flag) throws IOException {
        boolean isTypeSelected = false;
        boolean isSortingSelected = false;
        int flagsLength=0;//сделал ее,чтобы понимать сколько было флагов и с какой стринги брать путь к файлу в дальнейшем
                        //мб лучше по другому как то сделать, пока не думал(а надо бы)

        for (int i=0; i < flag.length; i++) {
            if(flag[i].substring(0, 1).equals("-")) {
                if (flag[i].length() > 2) {
                    System.out.println("Команда введена неверно, попробуйте еще раз");
                    start();
                } else {
                    switch (flag[i].substring(1, 2)) {
                        case "i":
                            if(!isTypeSelected) {
                                System.out.println("Пацаны тут интов нам привезли");
                                isTypeSelected=true;
                                flagsLength++;
                                break;
                            } else {
                                System.out.println("Ты по-моему что-то перепутал");
                                start();
                                break;
                            }
                        case "s":
                            if(!isTypeSelected) {
                                System.out.println("Разгружай вагон со стрингами");
                                isTypeSelected=true;
                                flagsLength++;
                                break;
                            } else {
                                System.out.println("Ты по-моему что-то перепутал");
                                start();
                                break;
                            }
                        case "a":
                            if(!isSortingSelected) {
                                System.out.println("Давай вира");
                                isSortingSelected=true;
                                flagsLength++;
                                break;
                            } else {
                                System.out.println("Ты по-моему что-то перепутал");
                                start();
                                break;
                            }
                        case "d":
                            if(!isSortingSelected) {
                                System.out.println("Майна, майна!");
                                isSortingSelected=true;
                                flagsLength++;
                                break;
                            } else {
                                System.out.println("Ты по-моему что-то перепутал");
                                start();
                                break;
                            }
                    }
                }
            }
        }
        return flagsLength;
        //TODO: проверять, если никакая команда не введена, то выставляем по дефолту
    }
}
