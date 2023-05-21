package lesson4.HomeWorkLesson4;

import java.util.Scanner;

public class Task_1 {
    /*1) У вас есть строка "Я тестирую замечательно. Что еще нужно?",
Которую нужно ввести с клавиатуры в консоль.
Необходимо при помощи только  метода next() класса Scanner
(не используем метод nextLine())
присвоить перемнным типа String следующие значения:
string1 = Я
string2 = тестирую
string3 = замечательно
string4 = Что еще нужно?
Помимо string1, string2, string3, string4 новых переменных
создавать нельзя.
  */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите Ваш текст: ");
        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next();
        String string4 = input.next() + " " + input.next() + " " + input.next();
        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);
    }
}
