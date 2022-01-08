package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value / 6 * 7;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value / 7 * 6;
        return rsl;
    }

    public static void main(String[] args) {
        float x = 140;
        float euro = Converter.rubleToEuro(x);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(x);
        System.out.println("140 rubles are " + dollar + " dollars.");
        float ruble = Converter.euroToRuble(x);
        System.out.println("140 euro are " + ruble + " rubles.");
        dollar = Converter.euroToDollar(x);
        System.out.println("140 euro are " + dollar + " dollars.");
        ruble = Converter.dollarToRuble(x);
        System.out.println("140 dollars are " + ruble + " rubles.");
        euro = Converter.dollarToEuro(x);
        System.out.println("140 dollars are " + euro + " euro.");
    }
}
