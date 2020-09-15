package com.codefortomorrow.intermediate.chapter11.solutions;

import java.util.Scanner;

/*
Write a method that computes the sum of the digits
in an integer. Use the following method header:

public static int sumDigits(long n)

For example, sumDigits(234) returns 9 (because 2 + 3 + 4). 

Hint: Use the % operator to extract digits,
and the / operator to remove the extracted digit.
For instance, to extract 4 from 234, use 234 % 10 (= 4).
To remove 4 from 234, use 234 / 10 (= 23).

Use a loop to repeatedly extract and remove the digit
until all the digits are extracted.

Write a test program that prompts the user to enter an integer and
displays the sum of all its digits.

Bonus points for writing a JavaDoc comment for the sumDigits method.

Adapted from Exercise 6.2, Introduction to Java Programming (Comprehensive),
10th ed. by Y. Daniel Liang
*/

public class SumDigits {

    public static void main(String[] args) {
        // prompt user for integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = input.nextLong();
        input.close();

        // print the sum of the digits in that integer
        System.out.println("Sum of digits in " + n + ": " + sumDigits(n));
    }

    /**
     * Return the sum of all of the digits
     * in the given number
     * @param n  a number to sum the digits of
     * @return the sum of all of the digits
     * in the given number
     */
    public static int sumDigits(long n) {
        int sum = 0;
        while (n > 0) {
            // extract last digit and add it to sum
            sum += n % 10;

            // remove the last digit
            n /= 10;
        }
        return sum;
    }
}
