package com.codefortomorrow.intermediate.chapter11.solutions;

/*
Code a method printEvens that takes an integer parameter n.
The method should print the first n even numbers to the console.
(Note that 0 is considered an even number.)

Test if your printEvens method works in the main method
by calling it at least 3 times with different arguments.

Bonus points if you write a JavaDoc comment
for the printEvens method.
*/

public class PrintEvens {

    public static void main(String[] args) {
        // test printEvens method
        printEvens(5); // prints 0 2 4 6 8
        printEvens(10); // prints 0 2 4 6 8 10 12 14 16 18
        printEvens(0); // prints nothing
    }

    /**
     * Prints the first n even integers
     * @param n  number of even integers to print
     */
    public static void printEvens(int n) {
        int evens = 0; // number of evens printed
        int i = 0; // current number
        while (evens < n) {
            // if current number is even, print it
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evens++;
            }
            i++;
        }
        System.out.println(); // move cursor to next line

        // alternate solution using for loop
        // int numberOfEvensPrinted = 0;
        // for (int num = 0; numberOfEvensPrinted < n; num++) {
        //     // if the number is even, print it
        //     if (num % 2 == 0) {
        //         System.out.print(num + " ");
        //         numberOfEvensPrinted++;
        //     }
        // }
        // System.out.println(); // move cursor to next line
    }
}
