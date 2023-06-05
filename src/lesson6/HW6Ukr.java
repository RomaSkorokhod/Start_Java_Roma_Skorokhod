package lesson6;

import java.util.Random;
import java.util.Scanner;

public class HW6Ukr {
    public static void main(String[] args) {
        String start = "Давай пограємо";
        System.out.println(start);
        Scanner input = new Scanner(System.in);
        System.out.println("Введи своє ім'я: ");
        String name = input.nextLine();
        System.out.println("Привіт, " + name + "!");
        String startGame = "Розпочинаємо гру.";
        System.out.println(startGame);
        String rules = "Правила легкі. Ти повинен вгадати число.";
        System.out.println(rules);


        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        int numberOfTries = 0;
        Scanner in = new Scanner(System.in);
        int guess;
        boolean win = false;
        System.out.println( "Я загадав число від 0 до 100" );

        while (win == false) {

            System.out.println( "Введи число:" );
            guess = input.nextInt();

            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;
            }
            else if (guess < numberToGuess) {
                System.out.println("Ти вказав меньше число, ніж я загадав\n");
            }
            else if (guess > numberToGuess) {
                System.out.println("Ти вказав більше число, ніж я загадав\n");
            }
        }
        System.out.println("\nТак! Ти вгадав! Вітаю!");
        System.out.println("Я загадав номер: " + numberToGuess);
        System.out.println("Кількість спроб: " + numberOfTries);
    }
}