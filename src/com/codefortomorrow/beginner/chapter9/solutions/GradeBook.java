package com.codefortomorrow.beginner.chapter9.solutions;

/*
 * Create a program called GradeBook
 * which prompts the user to enter
 * information for 6 students.
 *
 * The program should ask the user for
 * the student's first name (String), last initial (char),
 * student ID number (long), points earned (int),
 * and points possible (int).
 *
 * It should then print all of that data (see
 * sample output).
 *
 * Sample output: https://youtu.be/2KC8Zy6EIwc
 *
 * Hint: You may encounter a problem when using Scanner.
 * Read the following article for a solution:
 * https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
 */

import java.util.Scanner;

public class GradeBook {
	public static void main(String[] args) {
		final int NUMBER_OF_STUDENTS = 6;

		String[] firstName = new String[NUMBER_OF_STUDENTS];
		char[] lastInitial = new char[NUMBER_OF_STUDENTS];
		long[] studentIDNumber = new long[NUMBER_OF_STUDENTS];
		int[] pointsEarned = new int[NUMBER_OF_STUDENTS];
		int[] pointsPossible = new int[NUMBER_OF_STUDENTS];
		double[] percent = new double[NUMBER_OF_STUDENTS];

		Scanner input = new Scanner(System.in);

		for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
			System.out.println("Student #" + (i + 1));

			System.out.print("Enter first name: ");
			firstName[i] = input.nextLine();

			System.out.print("Enter last initial: ");
			lastInitial[i] = input.nextLine().charAt(0);

			System.out.print("Enter student ID number: ");
			studentIDNumber[i] = input.nextLong();

			System.out.print("Enter points earned: ");
			pointsEarned[i] = input.nextInt();

			System.out.print("Enter points possible: ");
			pointsPossible[i] = input.nextInt();

			input.nextLine(); // move cursor to next line

			// calculate percent
			percent[i] = ((double) pointsEarned[i] / pointsPossible[i]) * 100;

			System.out.println();
		}

		// display grade book
		System.out.print("Grade Book\n");

		for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
			System.out.printf("%s %s \t %d \t %d / %d \t %.2f%% \n", firstName[i], lastInitial[i],
					studentIDNumber[i], pointsEarned[i], pointsPossible[i], percent[i]);
		}
	}
}
