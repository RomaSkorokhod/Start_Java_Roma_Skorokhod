package lesson9.homeWorkLesson9.Task3;

import lesson9.homeWorkLesson9.Task3.Converter;

public class Main {
    public static void main(String[] args) {
        Converter converter = new Converter("Converter");
        int x = converter.convertToInt('g');
        int a = converter.convertToInt(false);
        double m = converter.convertToDouble('t');
        String w = converter.converToString("Проверка string");
        System.out.println(x);
        System.out.println(m);
        System.out.println(w);
    }
}
