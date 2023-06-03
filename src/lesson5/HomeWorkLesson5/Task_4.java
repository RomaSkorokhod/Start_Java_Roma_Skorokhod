package lesson5.HomeWorkLesson5;

import java.util.Scanner;

public class Task_4 {
/*    Создать три массива.
    Первый будет состоять из следующих имен:
            "Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
    Второй будет содержать следующие значения типа int:
            10, 12, 14, 16, 18, 20.
    Третий будет содержать следующие значения:
            "школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
    Пользователь вводит три числа с клавиатуры, которые будут соответствовать
    индексам каждого из элементов массивов.
    Пример1. после ввода 3,2,1:
    На экране должно вывестись следующее сообщение:
            "Федя будет идти в магазин в 14:00"
    Пример2. после ввода 1,2,3:
    На экране должно вывестись следующее сообщение:
            "Маша будет идти в тренажерный зал в 14:00"*/

    public static void main(String[] args) {
        String[] names = {"Петро", "Марія", "Олена", "Федір", "Олександр", "Антон", "Гліб"};
        String[] place = {"школу", "магазин", "церкву", "тренажерний зал", "кіно", "лікарню"};
        int[] time = {10, 12, 14, 16, 18, 20};
        Scanner input = new Scanner(System.in);
        int index1;
        while (true) {
            System.out.println("Введіть значення першого масиву");
            System.out.println("Від 0 до " + (names.length - 1));
            int index = input.nextInt();
            if (index >= 0 && index < names.length) {
                index1 = index;
                break;
            }
        }
        int index2;
        while (true) {
            System.out.println("Введіть значення другого масиву");
            System.out.println("Від 0 до " + (place.length - 1));
            int index = input.nextInt();
            if (index >= 0 && index < place.length) {
                index2 = index;
                break;
            }
        }
        int index3;
        while (true) {
            System.out.println("Введіть значення третього масиву");
            System.out.println("Від 0 до " + (time.length - 1));
            int index = input.nextInt();
            if (index >= 0 && index < time.length) {
                index3 = index;
                break;
            }
        }
        System.out.println(names[index1] + " буде йти в " + place[index2] + " в " + time[index3] + ":00");

    }
}
