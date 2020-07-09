package com.codefortomorrow.beginner.chapter9.examples;

import java.util.Scanner;

public class AverageScore {

    public static void main(String[] args) {
        // prompt user for 5 test scores
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 5 test scores, separated by spaces: ");

        // store the scores in an array
        double[] scores = new double[5];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
        }

        input.close();

        // calculate the sum of the scores
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }

        // calculate the average and display it
        double average = sum / 5;
        System.out.println("The average score is " + average);
    }
}
