package com.codefortomorrow.beginner.chapter3.examples;

public class Primitives {

    public static void main(String[] args) {
        boolean isHungry = true;
        System.out.println("isHungry: " + isHungry);

        char letter = 'h';
        System.out.println("letter: " + letter);

        int age = 5;
        //		int age = 5.5; // error
        System.out.println("age: " + age);

        long a = 567894567L;
        //		long a = 567_894_567L; // same as above but more readable
        System.out.println("a: " + a);

        float b = 567.8f;
        System.out.println("b: " + b);

        double c = 5.67;
        double d = 5;
        System.out.println("c: " + c);
        System.out.println("d: " + d); // prints 5.0
    }
}
