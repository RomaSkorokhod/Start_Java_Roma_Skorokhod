package helphomeWork10;

import lesson12.homewWork10.Family;
import lesson12.homewWork10.Human;

public class Main {
    public static void main(String[] args) {
        lesson12.homewWork10.Human mother = new lesson12.homewWork10.Human("Milana", "Bach", 23);
        lesson12.homewWork10.Human father = new lesson12.homewWork10.Human("Anatoliy","Bach", 25);
        lesson12.homewWork10.Human child1 = new lesson12.homewWork10.Human("Danil", "Bach", 12);
        lesson12.homewWork10.Family family1 = new Family(mother,father, "Bach");
        lesson12.homewWork10.Human child2 = new lesson12.homewWork10.Human("Danil", "Bach", 12);
        lesson12.homewWork10.Human child3 = new Human("Danil", "Bach", 12);
        System.out.println(father.getFamily().getFamilyName());
        System.out.println(family1.countFamily());
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        System.out.println(family1.countFamily());
        family1.deleteChild(1);
        System.out.println(child2.getFamily().getFamilyName());
        System.out.println(family1.countFamily());
    }
}
