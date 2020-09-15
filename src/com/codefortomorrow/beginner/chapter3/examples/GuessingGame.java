package com.codefortomorrow.beginner.chapter3.examples;

public class GuessingGame {

    public static void main(String[] args) {
        String name1 = "Kaz";
        String name2 = "Inej";
        String name3 = "Nina";
        String name4 = "Matthias";
        String name5 = "Jesper";
        String name6 = "Wylan";

        System.out.println("NAMES");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
        System.out.println(name5);
        System.out.println(name6);

        System.out.println("\nFRAGMENTS");
        System.out.println(name4.substring(4, 7)); // Matthias
        System.out.println(name1.substring(0, 2)); // Kaz
        System.out.println(name2.substring(2, 4)); // Inej
        System.out.println(name6.substring(3, 5)); // Wylan
        System.out.println(name3.substring(0, 3)); // Nina
        System.out.println(name5.substring(1, 5)); // Jesper
    }
}
