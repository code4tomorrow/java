package com.codefortomorrow.advanced.chapter13.examples;

// Convert the iterative gcd algorithm to a recursive algorithm.

public class IterToRecursive {

    public static void main(String[] args) {
        System.out.println("With iterative function:");

        int a = 72, b = 20;
        while (a != b) {
            if (a > b)
                a -= b;
            else if (b>a)
                b -= a;
        }
        System.out.println("GCD:" + a);

        System.out.println("With recursive function:");
        System.out.println("GCD:" + gcd(72, 20));
    }

    // Recursive function
    public static int power(int base, int exp) {
        // Base case: exp = 0, so the result is 1.
        if(exp == 0)
            return 1;

        // Multiply once by the previous power.
        return power(base, exp-1)*base;
    }

    public static int gcd(int a, int b) {
        // Base case
        if(a == b)
            return a;
        else if(a > b)
            return gcd(a-b, b);
        else
            return gcd(a, b-a);
    }
}
