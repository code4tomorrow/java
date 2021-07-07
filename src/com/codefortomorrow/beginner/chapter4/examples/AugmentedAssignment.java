package com.codefortomorrow.beginner.chapter4.examples;

public class AugmentedAssignment {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("1. a is " + a);

        a += 1; // equivalent to a = a + 1;
        System.out.println("2. a is " + a);

        a -= 2; // equivalent to a = a - 2;
        System.out.println("3. a is " + a);

        a *= 3; // equivalent to a = a * 3;
        System.out.println("4. a is " + a);

        // NOTE: In this case, we are doing integer division
        a /= 4; // equivalent to a = a / 4;
        System.out.println("5. a is " + a);

        a %= 5; // equivalent to a = a % 5;
        System.out.println("6. a is " + a);
    }
}
