package com.codefortomorrow.advanced.chapter13.solutions;

import java.util.Scanner;

/*
Write a method called isPrime which returns
true if the given integer is prime and false otherwise.

This is similar to the Chapter 11 problem, but this time write
your method using recursion.

In your main method, include a Scanner so the user can check
as many numbers as they want until they enter -1.

Note: There are more complex solutions, but this is the fastest one
within the scope of this chapter.
*/

public class PrimePractice {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int number = 0;
        while (number != -1) {
            System.out.print("Enter an integer to check: ");
            number = reader.nextInt();
            if (number != -1) {
                if (isPrime(number, 2)) {
                    System.out.println("That is a prime!");
                } else { 
                    System.out.println("Not a prime!");
                }
            }
        }
        reader.close();
    }

    /**
     * isPrime checks the primality of a given integer
     * @param n  The integer to check
     * @param z  Current divisor (used for recursion)
     * @return boolean true if prime and false if not
     */
    public static boolean isPrime(int n, int z) {
        // Check base cases
        if (n <= 2) {
            return n == 2;
        }
        
        // If n is divisible by the current divisor,
        // it has a factor other than 1 and thus is
        // not prime
        if (n % z == 0) {
            return false;
        }

        // If z gets high enough that z > sqrt(n), then n is prime,
        // because factors just repeat after
        if (z > Math.sqrt(n)) {
            return true;
        }

        // If none of the above work,
        // keep calling isPrime recursively
        // with a larger divisor
        return isPrime(n, z + 1);
    }
}
