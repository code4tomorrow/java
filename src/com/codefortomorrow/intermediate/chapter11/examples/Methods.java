package com.codefortomorrow.intermediate.chapter11.examples;

public class Methods {
    public static void main(String[] args) {
        // prints "Hello World" 5 times
        for (int i = 0; i < 5; i++) {
            printMessage();
        }
    }

    /** Prints "Hello World" */
    public static void printMessage() {
        System.out.println("Hello World");
    }
}