package lesson9.Practice;

public class Main {
    public static void main(String[] args) {
        Auto mercedes = new Auto("mercedes", true, 3000);
        Auto opel = new Auto("opel", 1500);

        System.out.println(mercedes.getName());
        System.out.println(opel.getName());

        mercedes.getInfo();
        System.out.println();
        opel.getInfo();
        System.out.println();

        System.out.println(opel);
        System.out.println(mercedes);



    }
}
