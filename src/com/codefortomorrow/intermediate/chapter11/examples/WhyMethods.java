package com.codefortomorrow.intermediate.chapter11.examples;

import java.util.Scanner;

public class WhyMethods {

    public static void main(String[] args) {
        // cleaner code because methods group actions
        printMessages();
        printSum();
    }

    /** Prints 3 messages */
    public static void printMessages() {
        System.out.println("May the Force be with you");
        System.out.println("Tahiti, it's a magical place");
        System.out.println("Live long and prosper");
    }

    /** Prints the sum of 2 numbers */
    public static void printSum() {
        Scanner input = new Scanner(System.in);

        // prompt user to enter 2 numbers
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();

        double sum = num1 + num2;

        // print the sum of those numbers
        System.out.println("Sum: " + sum);

        input.close();
    }
}
