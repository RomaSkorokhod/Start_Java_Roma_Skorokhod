package lesson8.homeWorkLesson8;

public class Task_1 {
/*Написать метод, принимающий в качестве параметра массив целых чисел.
И выводит на экран все четные числа списком,
а также нечетные числа списком.*/

    public static void main(String[] args) {
        int[] numbers = {2, 23, 5, 11, 7, 9};

        System.out.print("Парні числа: ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + ", ");
            }
            System.out.print("Непарні числа: ");
            for (i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {
                    System.out.print(numbers[i] + ", ");
                }
            }
        }
    }
}
