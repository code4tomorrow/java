package com.codefortomorrow.beginner.chapter2.examples;

public class Variables {

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        String name; // declaration
        name = "Kaz"; // initialization
        // String name = "Kaz"; // one step

        // initialization and declaration in one line
        String firstName = "Kaz", lastName = "Brekker";

        // declaration in one line
        String address, message;

        name = "Hello"; // assign a new value to name

        final int CENTS_PER_DOLLAR = 100; // constant
    }
}

// scope
class A {

    String message = "World";
}

class B {

    String word = "Java";
}
