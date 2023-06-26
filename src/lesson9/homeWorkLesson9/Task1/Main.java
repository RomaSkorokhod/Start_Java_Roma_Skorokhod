package lesson9.homeWorkLesson9.Task1;

public class Main {
    public static void main(String[] args) {
        Computer asus = new Computer("Asus", 10000, 8192, 2048);
        asus.getInfo();

        System.out.println();
        System.out.println(asus);
        System.out.println();

        Computer lenovo = new Computer("Lenovo", 8000, 6144, 1024);
        System.out.println(lenovo);
        System.out.println();

        Computer acer = new Computer("Acer", 9500, 6144, 2048);
        System.out.println(acer);
        System.out.println();

        Computer asus2 = new Computer("Asus", 10500, 8192, 2048);
        System.out.println(asus2);
        System.out.println();

        System.out.println(asus.equals(lenovo));
        System.out.println(asus.equals(asus));



    }
}
