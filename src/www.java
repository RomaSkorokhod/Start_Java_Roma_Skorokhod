import java.util.Scanner;

public class www {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Добрий вечір! \nВас вітає нова гра! \nВведіть Ваше ім'я:");
        String s = input.next();
        System.out.println("Привіт," + s + " !" + "\nДавай розв'яжемо легкий приклад. \nВведи будь-яке число" );
        int x = input.nextInt();
        System.out.println("Тепер введи друге число, а я виконаю додавання і скажу відповідь");
        int y = input.nextInt();
        int z = (x+y);
        System.out.println("Моя відповідь буде: " + z);
        if (z>100);
        System.out.println("Нажаль я умію робити додавання тільки до 100");
        

    }
}
