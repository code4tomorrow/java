package com.codefortomorrow.examples.intermediate;

public class DotNotation {
    public static void main(String[] args) {
        System.out.println(Math.PI); // dot notation to access the pi constant

        String s = "abcd";
        s = s.toUpperCase(); // dot notation to call toUpperCase method
        System.out.println(s); // prints "ABCD"

        Person myPerson = new Person(); // call constructor
        myPerson.eat("berries"); // dot notation to access the eat method
    }
}
