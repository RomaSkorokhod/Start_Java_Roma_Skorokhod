package lesson4.HomeWorkLesson4;

import java.util.Scanner;

public class Task_5 {
    /*(Использовать операторы if-else-if)
        Пользоватьель вводит с клавиатуры числа:
        Если число равно 1, то выводин на консоль "Понедельник";
        Если число равно 2, то выводин на консоль "Вторник";
        Если число равно 3, то выводин на консоль "Среда";
        Если число равно 4, то выводин на консоль "Четверг";
        Если число равно 5, то выводин на консоль "Пятница";
        Если число равно 6, то выводин на консоль "Суббота";
        Если число равно 7, то выводин на консоль "Воскресенье";
        В противном случае выводим текст:
                "Лучше бы сегодня была пятница".*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть число:");
        int a = input.nextInt();
        if (a == 1) {
            System.out.println("Понеділок");
        }
        if (a == 2) {
            System.out.println("Вівторок");
        }
        if (a == 3) {
            System.out.println("Середа");
        }
        if (a == 4) {
            System.out.println("Четвер");
        }
        if (a == 5) {
            System.out.println("П'ятниця");
        }
        if (a == 6) {
            System.out.println("Субота");
        }
        if (a == 7) {
            System.out.println("Неділя");
        } else if (a < 1 || a > 7) {
            System.out.println("Краще сьогодні була б п'ятниця");
        }

    }
}

