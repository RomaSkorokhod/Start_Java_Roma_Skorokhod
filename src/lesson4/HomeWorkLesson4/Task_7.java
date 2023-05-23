package lesson4.HomeWorkLesson4;

import java.util.Scanner;

public class Task_7 {
    /*Используя оператор switch написать программу, которая выводит на
консоль ссылку для скачивания программы.
Из выбора программ взять: IntelliJ IDEA, Git, Java.
Из выбора ОС взять: Linux, macOS, Windows.
Программа должна спросить пользователя какая программа ему интересна,
также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
Если программа с таким названием не существует выводит сообщение в консоль, о том
что такой программы не существует.
Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том
что такой ОС не существует.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть Вашу ОС: LiNux, macOS, Windows");
        String os = in.nextLine();
        String programm;
        switch (os.toUpperCase()) {
            case ("LINUX"):
                System.out.println("Введіть Вашу програму: IntelliJ IDEA, Git, Java");
                programm = in.nextLine();
                switch (programm.toLowerCase()) {
                    case ("intellij"):
                        System.out.println("Ваше посилання на intellij, linux");
                        break;
                    case ("git"):
                        System.out.println("Ваше посилання на git, linux");
                        break;
                    case ("java"):
                        System.out.println("Ваше посилання на java, linux");
                        break;
                    default:
                        System.out.println("Дану програму ми не знайшли");
                }
                break;
            case ("MACOS"):
                System.out.println("Введіть Вашу програму: IntelliJ IDEA, Git, Java");
                programm = in.nextLine();
                switch (programm.toLowerCase()) {
                    case ("intellij"):
                        System.out.println("Ваше посилання на intellij, macos");
                        break;
                    case ("git"):
                        System.out.println("Ваше посилання на git, macos");
                        break;
                    case ("java"):
                        System.out.println("Ваше посилання на java, macos");
                        break;
                    default:
                        System.out.println("Дану програму ми не знайшли");
                }


                break;
            case ("WINDOWS"):
                System.out.println("Введіть Вашу програму: IntelliJ IDEA, Git, Java");
                programm = in.nextLine();
                switch (programm.toLowerCase()) {
                    case ("intellij"):
                        System.out.println("Ваше посилання на intellij, windows");
                        break;
                    case ("git"):
                        System.out.println("Ваше посилання на git, windows");
                        break;
                    case ("java"):
                        System.out.println("Ваше посилання на java, windows");
                        break;
                    default:
                        System.out.println("Дану програму ми не знайшли");
                }

                break;
            default:
                System.out.println("Дану ОС не знайдено");
        }
    }
}
