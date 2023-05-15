package lesson4;

import java.util.Scanner;

public class HW_Java_Lesson4_Skorokhod_Roma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите ваше тескт:x");
        String s1 = input.next("я");
        String s2 = input.next("тестирую");
        String s3 = input.next("замечательно");
        String s4 = input.next("Что еще нужно?");

        System.out.println("Ваш введенный текст: я" + s1);
        System.out.println("Ваш введенный текст: тестирую" + s2);
        System.out.println("Ваш введенный текст: " + s3);
        System.out.println("Ваш введенный текст: " + s4);
    }
}