package ru.job4j.array;

import java.sql.SQLOutput;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);
        float[] prices = new float[40];
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Semen Bulytov";
        names[2] = "Stas Korobeinikov";
        names[3] = "Elena Kartashova";
        for (int i = 0; i <= 3; i++) {
            System.out.println(names[i]);
        }
    }
}
