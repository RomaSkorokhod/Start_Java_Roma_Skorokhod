package lesson5.HomeWorkLesson5;

public class Task_6 {
    /*   Заполнить массив на 45 элементов случайными числами
       от -50 до +50. Найти минимальный элемент и вывести его
       на консоль. Найти максимальный элемент и вывести его на
       консоль.*/
    public static void main(String[] args) {
        int[] arrayInt = new int[45];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) ((Math.random() * 101) - 50);
            System.out.print(arrayInt[i] + " ");
        }
        int minValue = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] < minValue) {
                minValue = arrayInt[i];
            }

        }
        System.out.println("\n" + "Мінімальне значення: " + minValue);

        int maxValue = arrayInt[0];
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] > maxValue) {
                maxValue = arrayInt[i];
            }
        }
        System.out.println("\n" + "Максимальне значення: " + maxValue);
    }

}



