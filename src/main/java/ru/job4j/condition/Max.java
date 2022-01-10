package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean condition = left > right;
        int result = condition ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int left = 5;
        int right = 10;
        int rsl = Max.max(left, right);
        System.out.println(rsl);
    }
}
