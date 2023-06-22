package lesson4.if_else;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        double cost = 1000;
        Scanner input = new Scanner(System.in);
        System.out.print("Введіть Ваш вік ");
        int age = input.nextInt();
        if (age <= 18 || age > 55 ) {
            if (age == 13) {
                cost = cost * 0.6;
                System.out.println("Ціна квитка = " + cost);
            } else {
                cost = cost * 0.75;
                System.out.println("Ціна квитка = " + cost);
            }
        } else {
            System.out.println("Ціна квитка = " + cost);
        }
    }
}

