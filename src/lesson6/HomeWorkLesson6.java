package lesson6;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkLesson6 {
    /*Масиви

Завдання
Написати програму "числа", яка загадує випадкове число та пропонує гравцеві його вгадати.

Технічні вимоги:

За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
та пропонує гравцеві через консоль ввести своє ім'я, яке зберігається в змінній name.
Перед початком на екран виводиться текст: Let the game begin!

Сам процес гри обробляється у нескінченному циклі.
Гравцеві пропонується ввести число в консоль, після чого програма порівнює загадану
кількість з тим, що ввів користувач.
Якщо введене число менше загаданого, програма виводить на екран текст:
Your number is too small. Please, try again.. Якщо введене число більше за загадане,
то програма виводить на екран текст: Your number is too big. Please, try again..
Якщо введене число відповідає загаданому, то програма виводить текст: Congratulations, {name}!

Завдання повинно бути виконане за допомогою масиви (НЕ використовуйте інтерфейси List, Set, Map).
*/
    public static void main(String[] args) {
        String start = "Let the game begin!";
        System.out.println(start);
        Scanner name = new Scanner(System.in);
        System.out.println("Input your name:");
        String n = name.next();
        System.out.println("Hello, "+n +"!");
        String startGame = "Let start our game!";
        System.out.println(startGame);
        String rules = "You have to guess a number between 0 and 100";
        System.out.println(rules);

        int[] array = new int [1];
        Random random = new Random();





        /*Scanner input = new Scanner(System.in);
        System.out.println("Input your nuber:");
        int x = input.nextInt();*/
    }


}
