package lesson4.HomeWorkLesson4;

import java.util.Scanner;

public class Task_6 {
    /*6) Написать программу, используя тернарный оператор,
    где пользователь вводит с клавиатуры два числа
    и символ - или + или % или / или *.
    На экран выводится резултат действия над двумя введенными числами.
    Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0.*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int number1 = in.nextInt();

        System.out.println("Введіть друге число:");
        int number2 = in.nextInt();

        System.out.println("Яку математичну дію Ви хочете виконати з даними числами (- або + або % або / або *)?:");
        String action = in.next();


        boolean s = ("qwerrty").equals("qwerty");
        boolean s2 = ("qwerty").equals("qwerty");


        int result = action.equals("+") ? number1 + number2 :
                action.equals("-") ? number1 - number2 :
                        action.equals("*") ? number1 * number2 :
                                action.equals("/") ? number1 / number2 :
                                        action.equals("%") ? number1 % number2 : 0;
        System.out.println(result);
    }
}
