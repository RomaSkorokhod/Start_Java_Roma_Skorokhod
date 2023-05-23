package lesson4.HomeWorkLesson4;

import java.util.Scanner;

public class Task_4 {
   /* Вывести следующие сообщение в отформатированном виде (необходимо добавить спецификаторы формата):
    У вас есть строка:
    Число {X} больше {Y}, и это {True/False}
    Вместо {X},{Y},{True/False} вставляем необходимые спецификаторы формата.
    Для аргументов создаем отдельно переменные, которые запрашиваются для ввода с клавиатуры.
    После ввода с клавиатуры к примеру чисел 5 и 7 должно выводиться сообщение след. типа:
    Вывод: Число 5 болшье 7, и это false.*/
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Введіть будь яке число:");
       int x = input.nextInt();
       if(x<7){
           System.out.println("Ваше число: "+x);
           System.out.println("Дане число меньше ніж 7");
       } else {
           System.out.println("Ваше число: "+x);
           System.out.println("Дане число більше ніж 7");

       }
   }
}
