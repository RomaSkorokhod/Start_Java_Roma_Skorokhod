package lesson8;

public class Student {

    public String name;
    public String sename;
    public int age;

    public String getName(){
        return name;
    }
 public void setName(String nameText){
        this.name = nameText;
 }
    public void makeWork(){
        System.out.println("Що я можу зробити");
    }

}