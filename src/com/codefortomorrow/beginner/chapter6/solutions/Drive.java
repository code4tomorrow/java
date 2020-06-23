package com.codefortomorrow.beginner.chapter6.solutions;

/*
 * Create a program called Drive.
 * In the main method, do the following:
 * - Prompt the user to enter their age
 * - Create 3 boolean expressions isMinor,
 *   isAdult, and isSenior. A person is
 *   a minor if they're under 18. They are
 *   an adult if they're 18-64 years old.
 *   They are a senior if they're 65+.
 * - Use the boolean expressions to print
 *   the age group the user is in.
 * - Use the boolean expressions to print
 *   whether the user can drive. An adult
 *   or senior can drive, while a minor cannot.
 */

import java.util.Scanner;

public class Drive {
	public static void main(String[] args) {
		// prompt user to enter their age
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		input.close();

		// boolean expressions
		boolean isMinor = age < 18;
		boolean isAdult = age >= 18 && age < 65;
		boolean isSenior = age >= 65;

		// print which age category the person belongs to
		if (isMinor) {
			System.out.println("You are a minor.");
		} else if (isAdult) {
			System.out.println("You are an adult.");
		} else {
			System.out.println("You are a senior.");
		}

		// print whether the person can drive
		if (isAdult || isSenior) {
			System.out.println("Old enough to drive!");
		} else {
			System.out.println("Sorry, not old enough to drive.");
		}
	}
}
