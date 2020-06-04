package com.codefortomorrow.beginner.chapter5.solutions;

/*
 * Create a program called Average
 * which prompts the user to enter
 * 3 numbers. (These numbers could be
 * decimals or integers.)
 *
 * Compute and display the average
 * of the 3 numbers.
 */

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		// prompt user to enter 3 numbers
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		double number1 = input.nextDouble();

		System.out.print("Enter number 2: ");
		double number2 = input.nextDouble();

		System.out.print("Enter number 3: ");
		double number3 = input.nextDouble();

		// calculate and display the average
		double average = (number1 + number2 + number3) / 3;
		System.out.println("The average is " + average);
	}
}
