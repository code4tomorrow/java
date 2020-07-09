package com.codefortomorrow.beginner.chapter5.examples;

import java.util.Scanner;

public class DifferentInput {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = reader.nextLine(); // nextLine is for reading Strings

        System.out.print(
            "What's the value of pi, as precisely as you can enter? "
        );
        double pi = reader.nextDouble(); // nextDouble is for reading doubles

        System.out.print("What's your favorite integer? ");
        int favoriteInteger = reader.nextInt(); // nextInt is for reading ints

        System.out.println("Name: " + name);
        System.out.println("Pi: " + pi);
        System.out.println("Favorite integer: " + favoriteInteger);

        reader.close();
    }
}
