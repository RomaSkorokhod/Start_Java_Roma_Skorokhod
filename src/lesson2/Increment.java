package lesson2;

public class Increment {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;
        x = x++ - y++ + ++x;
        y+=3;
        int z = --x + --y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        System.out.println((double)14/(double)3);
        System.out.println(14%3);
    }
}