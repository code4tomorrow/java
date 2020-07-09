package com.codefortomorrow.beginner.chapter8.solutions;

/*
 * Write a program called CountAverage
 * that reads an unspecified number of integers,
 * determines how many positive and negative
 * values have been read, and computes the
 * total and average of the input values (not
 * counting zeros). Your program ends with the input 0.
 * Display the average as a decimal. You can assume
 * that the user will enter at least 1 non-zero number.
 *
 * Sample output:
 * Enter integers separated by spaces. Input ends if it is 0: 1 2 -1 3 0
 * The number of positives is 3
 * The number of negatives is 1
 * The total is 5
 * The average is 1.25
 *
 * Adapted from Exercise 5.1 from
 * Introduction to Java Programming (Comprehensive), 10th ed.
 * by Y. Daniel Liang
 */

import java.util.Scanner;

public class CountAverage {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
            "Enter integers separated by spaces. Input ends if it is 0: "
        );
        int n = input.nextInt();
        input.close();

        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int total = 0;
        while (n != 0) {
            if (n > 0) {
                numberOfPositives++;
            } else {
                numberOfNegatives++;
            }
            total += n;
            n = input.nextInt();
        }

        if (numberOfPositives + numberOfNegatives != 0) {
            double average = (double) total /
            (numberOfPositives + numberOfNegatives);
            System.out.println(
                "The number of positives is " + numberOfPositives
            );
            System.out.println(
                "The number of negatives is " + numberOfNegatives
            );
            System.out.println("The total is " + total);
            System.out.println("The average is " + average);
        } else {
            System.out.println("Error, no positive/negative numbers entered");
        }
    }
}
