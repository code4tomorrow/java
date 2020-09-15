package com.codefortomorrow.intermediate.chapter11.examples;

public class Overloading {

    public static void main(String[] args) {
        // call 2-arg sum
        System.out.println(sum(2, 3)); // prints 5

        // call 3-arg sum
        System.out.println(sum(1, 4, 7)); // prints 12
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return sum(a, b) + c;
    }
}
