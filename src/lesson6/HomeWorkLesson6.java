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


Необов'язкове завдання просунутої складності:

Перед переходом на наступну ітерацію, програма зберігає введене користувачем число масив.
Після того, як гравець вгадав загадане число, перед виходом програма виводить на екран текст:
Your numbers: і показує всі введені гравцем числа, відсортовані від більшого до меншого.
Після введення чисел користувачем додати перевірку їх коректності.
Якщо користувач запровадив не число - запитати заново.
Додайте грі трохи більше сенсу: нехай загадане число буде роком,
якому відповідає відома подія. Інформація про роки зберігається
у двовимірному масиві [рік Х подія].
Програма спочатку вибирає випадковим чином комірку в матриці й виводить на екран:
When did the World War II begin?*/
    public static void main(String[] args) {
        String start = "Let the game begin!";
        System.out.println(start);
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = input.nextLine();
        System.out.println("Hello, " + name + "!");
        String rules = "The rules are easy. You have to guess the number.";
        System.out.println(rules);


        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        int numberOfTries = 0;
        Scanner in = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println("I guessed a number from 0 to 100");

        while (win == false) {

            System.out.println( "Input number:" );
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            }
            else if (guess < numberToGuess) {
                System.out.println("Your number is too small. Please, try again..");
            }
            else if (guess > numberToGuess) {
                System.out.println("Your number is too big. Please, try again..");
            }
        }
        System.out.println("Congratulations," + name + "!");
        System.out.println("I guessed the number: " + numberToGuess);
    }
}
