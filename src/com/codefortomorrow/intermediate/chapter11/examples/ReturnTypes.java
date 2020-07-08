package com.codefortomorrow.intermediate.chapter11.examples;

public class ReturnTypes {
    public static void main(String[] args) {
        printSum(5, 4);
        int myNumber = sum(5, 4) / 2;
        System.out.println(myNumber);
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}