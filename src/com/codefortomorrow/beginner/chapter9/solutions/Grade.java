package com.codefortomorrow.beginner.chapter9.solutions;

/*
 * Create a program called Grade
 * which prompts the user for
 * the number of test scores to be
 * entered and then prompts the user
 * to enter those scores.
 *
 * Then your program should print
 * the letter grades that correspond
 * to each score. (Use a char[] array
 * to store the letter grades.)
 *
 * Sample output:
 *
 * Enter the number of test scores: 5
 * Enter score 1: 3
 * Enter score 2: 61
 * Enter score 3: 100
 * Enter score 4: 87
 * Enter score 5: 75
 *
 * Grades:
 * F D A B C
 */

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		// prompt user to enter the number of test scores
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of test scores: ");
		int numberOfScores = input.nextInt();

		char[] grades = new char[numberOfScores];

		for (int i = 0; i < numberOfScores; i++) {
			// prompt user to enter the score
			System.out.print("Enter score " + (i + 1) + ": ");
			double score = input.nextDouble();

			// store the letter grade
			if (score >= 90) {
				grades[i] = 'A';
			} else if (score >= 80) {
				grades[i] = 'B';
			} else if (score >= 70) {
				grades[i] = 'C';
			} else if (score >= 60) {
				grades[i] = 'D';
			} else {
				grades[i] = 'F';
			}
		}

		input.close();

		// display the letter grades
		System.out.println("\nGrades:");
		for (char grade: grades) {
			System.out.print(grade + " ");
		}
		System.out.println();
	}
}
