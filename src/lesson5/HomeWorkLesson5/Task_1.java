package lesson5.HomeWorkLesson5;

import java.util.Scanner;

public class Task_1 {
    /* Написать программу, которая будет считывать введенные пользователем
     слова с клавиатуры, и склеивать их в одно предложение до тех пор,
     пока пользователь не введет с клавитуры слово STOP.
     Все слова введенные до этого должны отобразится в консоли
     одним предложением.*/
    public static void main(String[] args) {
        String string = "";
        Scanner scanner = new Scanner(System.in);
        String keyWord;
        while (true) {
            System.out.println("Insert");
            keyWord = scanner.nextLine();
            if (keyWord.equalsIgnoreCase("stop")) {
                break;
            }
            string = string + keyWord + " ";
        }
        System.out.println(string);
    }
}

