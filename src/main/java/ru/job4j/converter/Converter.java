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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float dollar = Converter.rubleToDollar(x);
        System.out.println("140 rubles are " + dollar + " dollars.");
        expected = 2.3333333F;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.33. Test result : " + passed);
        float ruble = Converter.euroToRuble(x);
        System.out.println("140 euro are " + ruble + " rubles.");
        expected = 9800;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("140 euro are 9800. Test result : " + passed);
        dollar = Converter.euroToDollar(x);
        System.out.println("140 euro are " + dollar + " dollars.");
        expected = 163.33334F;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("140 euro are 163.33. Test result : " + passed);
        ruble = Converter.dollarToRuble(x);
        System.out.println("140 dollars are " + ruble + " rubles.");
        expected = 8400;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("140 dollars are 8400. Test result : " + passed);
        euro = Converter.dollarToEuro(x);
        System.out.println("140 dollars are " + euro + " euro.");
        expected = 120;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("140 dollars are 120. Test result : " + passed);
    }
}
