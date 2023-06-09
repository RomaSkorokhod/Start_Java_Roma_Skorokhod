package lesson8;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        String string = "";
        Scanner scanner = new Scanner(System.in);
        String keyWord;
        while (true) {
            System.out.println("Insert");
            keyWord = scanner.nextLine();
            if (keyWord.equalsIgnoreCase("stop")) {
                break;
            }
            string = string + keyWord + " ";
        }
        System.out.println(string);
    }
}
