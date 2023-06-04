package lesson7;

public class Practice {
    public static void main(String[] args) {
        String[][] name = new String[3][3];
        name[0][0] = "Kostyk";
        name[0][1] = "Schyglyk";
        name[0][2] = "Khomyak";
        name[1][0] = "Liva";
        name[1][1] = "Tania";
        name[1][2] = "Oksana";
        name[2][0] = "Patron";
        name[2][1] = "Kit";
        name[2][2] = "Alonso";

        String[][] names2 = {
                {"Kostyk", "Schyglyk", "Khomyak"},
                {"Liva", "Tania", "Oksana" },
                {"Patron", "Kit", "Alonso"}
        };
        System.out.println(names2[1][1]);

    }


}
