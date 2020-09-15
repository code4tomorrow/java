package com.codefortomorrow.beginner.chapter7.solutions;

/*
 * Create a program called Max,
 * which prompts the user to
 * enter 2 numbers.
 *
 * Use the ternary operator to
 * assign a value to a variable
 * max, and then print the max.
 */

import java.util.Scanner;

public class Max {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double n1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double n2 = input.nextDouble();
        input.close();

        double max = (n1 > n2) ? n1 : n2; // real world: use Math.max(n1, n2)
        System.out.println("The max of " + n1 + " and " + n2 + " is " + max);
    }
}
