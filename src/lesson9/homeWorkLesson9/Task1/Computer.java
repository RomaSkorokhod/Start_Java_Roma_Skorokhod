package lesson9.homeWorkLesson9.Task1;

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
}
