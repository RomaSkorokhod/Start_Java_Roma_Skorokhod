package lesson9.homeWorkLesson9.Task1;

import java.util.Objects;

public class Computer {
    /*Создать класс Computer c конструктором принимающим параметры
    Марка тип String, цена тип int, оперативная память тип int,
    и видеокарта тип int.
    Переопределить метод toString для вывода объекта класса в след. виде:
            "Создан PC.
    Имя = марка.
            Цена = цена.
            Видеокарта = объем видеокарты
    ОЗУ = Объем оперативной памяти."

    Все поля класса Computer должны быть приватными.
    Также создайте публичные методы для получения информации о полях класса Computer.
    А также методы для изменения его полей.

    Переопределите метод equals и метод hashCode для вашего класса.
    Сделайте так, чтобы компьютеры считались одинаковыми в случае если у них
    равны значения полей марка, оперативная память и видеокарта.

    В отдельном классе создайте объект класса компьютер, и выведите в консоль
    информацию о вашем объекте.*/

    private String name;
    private int price;
    private int ram;
    private int videoCard;

    public Computer(String name, int price, int ram, int videoCard) {
        this.name = name;
        this.price = price;
        this.ram = ram;
        this.videoCard = videoCard;
    }
    public Computer() {

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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(int videoCard) {
        this.videoCard = videoCard;
    }

    public void  getInfo(){
        System.out.println("PC " + name + " : " + price + "UAH " + ram + "Mb " + videoCard + "Mb ");
    }
    @Override
 public  String toString(){
        return "Создан PC: " + name + "\n" +
                "Цена: " + price + "UAH" + "\n" +
                "Объем видеокарты: " + videoCard + "Mb" +"\n" +
                "Объем оперативной памяти: " + ram + "Mb";


}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return price == computer.price && ram == computer.ram && videoCard == computer.videoCard && Objects.equals(name, computer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, ram, videoCard);
    }
}
