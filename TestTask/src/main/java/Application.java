import java.util.Scanner;

public class Application {
    final Scanner scanner;

    public Application(Scanner scanner) {
        this.scanner = scanner;
    }

    public void start() {
        System.out.print("Введи команды и адреса файлов: ");


        //path - читаем, что с консоли ввели
        String path = scanner.nextLine();
        //in.close();
        //далее парсим это безобразие
        String[] subStr;
        subStr = path.split(" ");

        checkFlags(subStr);


    }

    private void checkFlags(String[] flag) {
        boolean isTypeSelected = false;
        boolean isSortingSelected = false;

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
        //TODO: проверять, если никакая команда не введена, то выставляем по дефолту
    }
}
