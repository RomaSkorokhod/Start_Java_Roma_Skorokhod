package lesson8.homeWorkLesson8;

import java.util.Scanner;

public class Task4 {
  /*  Пользователь задает размерность двумерного массива с клавиатуры.
    Массив заполняется случайными числами от 0 до 1000.
    Необходимо создать одномерный массив, состоящий из максимальных значений
    каждого отдельного массива входящего в двумерный.
    Новый полученный массив вывести на экран.*/
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Insert first value");
      int first = scanner.nextInt();
      System.out.println("Insert second value");
      int second = scanner.nextInt();
      int[][] doubleArray = new int[first][second];

  }
}
