package com.codefortomorrow.advanced.chapter14.examples;

public class Throw {

    public static void main(String[] args) {
        try {
            System.out.println(divide(7, 2));
        } catch (ArithmeticException e) {
            System.out.println("There was an arithmetic exception.");
        }
    }

    public static int divide(int a, int b) {
        int result = a / b;
        if (result != (double) a / (double) b) throw new ArithmeticException();
        System.out.println("Got to end of divide()");
        return a / b;
    }
}
