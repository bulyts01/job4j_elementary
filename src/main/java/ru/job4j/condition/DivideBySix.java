package ru.job4j.condition;

public class DivideBySix {

    public static String checkNumber(int number) {
        String rslt;
        if (number % 3  == 0 && number % 2 == 0) {
            rslt = "Исходное число делится на 6.";
        } else if (number % 3  == 0) {
            rslt = "Исходное число делится на 3, но не является четным.";
        } else if (number % 2 == 0) {
            rslt = "Исходное число не делится на 3, но является четным.";
        } else {
            rslt = "Исходное число не делится на 3 и не является четным.";
        }
        return rslt;
    }
}
