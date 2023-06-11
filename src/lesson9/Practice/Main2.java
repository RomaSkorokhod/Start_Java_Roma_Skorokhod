package lesson9.Practice;

public class Main2 {
    public static void main(String[] args) {
        Auto mercedes = new Auto("mercedes", true, 3000);
        Auto opel = new Auto("opel", 1500);

        System.out.println(mercedes);
        System.out.println(opel);

        String auto = String.valueOf(opel);
        System.out.println(auto);
    }
}
