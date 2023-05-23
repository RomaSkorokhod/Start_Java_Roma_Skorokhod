package lesson4.HomeWorkLesson4;

import java.util.Date;
import java.util.Scanner;

public class Task_3 {
    /*    3)Пользователь вводит с клавиатуры свой год рождения.
        На консол выводится информация о его возрасте.
        Используем класс Date как на занятии.
        (P.s пока не затрагиваем момент месяца рождения,
        останавливаемся только на разнице лет. Если вам
        вдруг понадобится преобразовать тип String в int,
        то можете воспользоватьсятакой конструкцией Integer.parseInt(строка для преобразования).
        */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть рік Вашого народження:");
        int yearOfBirth = in.nextInt();
        Date date = new Date();

        System.out.println(date);

        String actualYear = String.format("%tY", date);

        int actualYearInt = Integer.parseInt(actualYear);
        System.out.println("Ваш вік: " + (actualYearInt - yearOfBirth));
    }
}