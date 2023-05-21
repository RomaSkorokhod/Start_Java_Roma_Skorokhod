package lesson4;

import java.util.Date;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*        System.out.println("Введіть ваше число: ");
        int x = input.nextInt();
        System.out.println("Ваше введене число дорівнює: "+x);

        System.out.println("Введіть дробове число (через кому): ");
        double z = input.nextDouble();
        System.out.println("Ваше введене число дорівнює: "+z);*/

        System.out.println("Введіть пароль:");
        String s2 = input.nextLine();
        System.out.println("Ви ввели: "+s2);

        System.out.println("Повторіть пароль:");
        String s3 = input.nextLine();
        System.out.println("Ваш новий пароль: "+s3);

    }
}
