package lesson4.HomeWorkLesson4;

import java.util.Scanner;

public class Task_2 {
    /*2)Пользователь вводит с клавиатуры три целочисленных значения
      На экран выводится информация можно ли длины из этих сторон
      построить треугольник.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть довжину першої сторони трикутника");
        int a = in.nextInt();
        System.out.println("Введіть довжину другої сторони трикутника");
        int b = in.nextInt();
        System.out.println("Введіть довжину третьої сторони трикутника");
        int c = in.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Із даних сторін ми можемо побудувати трикутник");
        } else {
            System.out.println("Із даних сторін трикутник не може бути побудований");
        }

    }
}
