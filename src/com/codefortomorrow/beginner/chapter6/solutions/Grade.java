package com.codefortomorrow.beginner.chapter6.solutions;

/*
 * Create a class called Grade.
 * In the main method, prompt the user
 * to enter a test score as a percent.
 * Then, print out the letter grade
 * that that score would receive.
 */

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        // prompt the user to enter a test score
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a score (as a percent): ");
        double score = input.nextDouble();
        input.close();

        // print the letter grade based on the score
        System.out.print("Grade: ");

        if (score >= 90) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C');
        } else if (score >= 60) {
            System.out.println('D');
        } else {
            System.out.println('F');
        }
    }
}
