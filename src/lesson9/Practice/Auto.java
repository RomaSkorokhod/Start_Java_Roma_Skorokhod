package lesson9.Practice;

/*
    1)Создать класс Auto. В данном классе создать поле String name, int price, boolean isNew
    создать геттеры и сеттеры для данных полей, а также конструктор класса,
    принимающий в параметры все поля данного класса.
    Cоздать в данном классе метод, который выводит в консоль всю информацию о имени
    автомобиля, его цене, и о том является он новым или нет.
    */

public class Auto {
    private String name;
    private   int price;
    private   boolean isNew;

    public Auto(String name, boolean isNew, int price){
        this.name = name;
        this.isNew = isNew;
        this.price = price;
    }

    public Auto(String name, int price){
        this.name = name;
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public  void getInfo(){
        System.out.println("Ім'я автомобіля: " + name);
        System.out.println("Ціна автомобіля: " + price);
        if (isNew == true){
            System.out.println("Автомобіль новий");
        } else {
            System.out.println("Авто колись було нове ");
        }
    }

    @Override
    public String toString() {
        String result;
        if (isNew){
            result = "Автомобіль новий";
        } else {
            result = "Авто колись було нове ";
        }
        return "Ім'я автомобіля: " + name + "\n" +
                "Ціна автомобіля: " + price + "\n" +
                result;


    }
}
