import java.util.Random;
import java.util.Scanner;

public class qw {
    public static void main(String[] args) {
        int[] array = new int[1];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(+ array[i] + " ");
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
