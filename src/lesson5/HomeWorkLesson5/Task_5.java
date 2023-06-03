package lesson5.HomeWorkLesson5;

import java.util.Random;
import java.util.Scanner;

public class Task_5 {
 /*   Есть одномерный массив из 10 элементов, заполнен-
    ный случайными числами. Пользователь вводит с клавиатуры
    число. Программа показывает есть ли такое число в созданном
    до этого массиве.*/

    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print("Масив" + array[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n Введіть число: ");
        int number = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + number + " знайдено в масиві.");
        } else {
            System.out.println("Число " + number + " не знайдено в масиві.");
        }
    }
}
