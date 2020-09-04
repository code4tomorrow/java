package com.codefortomorrow.advanced.chapter13.practice;

/*
Write a method called isPrime which returns
true if the given integer is prime and false otherwise.

This is similar to the chapter 11 problem, but this time write
your method using recursion.

In your main method, include a scanner so the user can check
as many numbers as they want until they enter -1.

Note: There are more complex solutions, but this is the fastest one
within the scope of this chapter.
*/

import java.lang.Math;
import java.util.Scanner;

public class PrimePractice {

    public static void main(String[] args) {
        int s = 0;
        while (s != -1) {
            Scanner reader = new Scanner(System.in);
            System.out.print("Enter an integer to check: ");
            s = reader.nextInt();
            if (s != -1) {
                if (isPrime(s, 2)) System.out.println(
                    "That is a prime!"
                ); else System.out.println("Not a prime!");
            }
        }
    }

    //n is the number to check, z is the current number being divided
    public static boolean isPrime(int n, int z) {
        //Check base cases
        if (n <= 2) return (n == 2) ? true : false;
        //Ternary operator used there
        if (n % z == 0) return false;
        //If z gets high enough that z > sqrt(n), then n is prime, because factors just repeat after
        if (Math.pow(z, 2) > n) return true;

        //If none of the above work
        return isPrime(n, z + 1);
    }
}
