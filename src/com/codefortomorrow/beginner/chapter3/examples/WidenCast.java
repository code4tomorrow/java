package com.codefortomorrow.beginner.chapter3.examples;

/*
 * Adapted from W3Schools Java Type Casting
 * https://www.w3schools.com/java/java_type_casting.asp
 */

public class WidenCast {

    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt); // Outputs 9
        System.out.println(myDouble); // Outputs 9.0
    }
}
