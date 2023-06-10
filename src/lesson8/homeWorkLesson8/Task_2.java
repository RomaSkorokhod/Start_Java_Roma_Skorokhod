package lesson8.homeWorkLesson8;

public class Task_2 {
    /*Написать перегруженный метод, который может:
            - не принимать никаких значений, тогда он будет выводить на консоль сообщение типа:
            "Я пустой".
            - Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
            - Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения
    через пробел.
            - Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов
    массива.
         - Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
            "Ваше сообщение - "%%%%%%%%", ваше число -  $",
    где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/

    public static void doSmth() {
        System.out.println("Я пустой");
    }

    public static void doSmth(String text) {
        System.out.println("" + text);
    }

    public static void doSmth(String text1, String text2, String text3){
        System.out.println(text1 + " " + text2 + " " + text3);
    }

    public static void doSmth(int number1, int number2, int number3){
        System.out.println(number1 + number2 + number3);
    }

    public static void doSmth(int nubmer, String text){
        System.out.println("Ваше повідомлення - " + text + "Ваше число - " + nubmer);
    }

    public static void main(String[] args) {
        doSmth();
        doSmth("Привет" );
        doSmth("Hello","my","friend");
        doSmth(3, 5, 6);
        doSmth(7 , "Good morning! ");







    }

}
