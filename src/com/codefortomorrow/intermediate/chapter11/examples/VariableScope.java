package com.codefortomorrow.intermediate.chapter11.examples;

public class VariableScope {
    public static void main(String[] args) {
        method1(); // prints 5.0
        method2(); // prints 2.0
        // System.out.println(a);  throws an exception
    }

    public static void method1() {
        double a = 5;
        System.out.println(a);
    }

    public static void method2() {
        // both variables are called a
        double a = 2;
        System.out.println(a);
    }
}