package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        String idea = "I like Java!";
        System.out.println(idea);
//        idea = idea + " But I am a newbie. ";
        idea += " But I am a newbie. ";
        System.out.println(idea);
        int year = 2022;
//        idea = idea + year;
        idea += year;
        System.out.println(idea);
    }
}
