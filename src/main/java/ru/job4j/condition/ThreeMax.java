package ru.job4j.condition;

public class ThreeMax {

    public static int max(int first, int second, int third) {
        int rsl = third;
        if (first >= second && first >= third) {
            rsl = first;
        } else if (second >= first && second >= third) {
            rsl = second;
        }
        return rsl;
    }
}
