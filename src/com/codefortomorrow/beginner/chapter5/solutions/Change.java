package com.codefortomorrow.beginner.chapter5.solutions;

/*
 * Prompt the user for an amount of money in standard format (ex. 11.56).
 * Print the number of dollars, quarters, dimes, nickels, and
 * pennies that makes up the given amount of money.
 * Hint 1: Convert the amount of money to cents.
 * Hint 2: You might find the modulus operator to be useful.
 */

import java.util.Scanner;

public class Change {
	public static void main(String[] args) {
		// step 0: set constants (optional)
		final int CENTS_PER_DOLLAR = 100;
		final int CENTS_PER_QUARTER = 25;
		final int CENTS_PER_DIME = 10;
		final int CENTS_PER_NICKEL = 5;

		// step 1: ask user to enter an amount of money
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an amount of money (omit the $): ");
		double money = input.nextDouble();
		input.close();

		// step 2: calculate the change
		int remainingAmount = (int) (money * 100); // convert to cents

		int dollars = remainingAmount / CENTS_PER_DOLLAR;
		remainingAmount %= CENTS_PER_DOLLAR;

		int quarters = remainingAmount / CENTS_PER_QUARTER;
		remainingAmount %= CENTS_PER_QUARTER;

		int dimes = remainingAmount / CENTS_PER_DIME;
		remainingAmount %= CENTS_PER_DIME;

		int nickels = remainingAmount / CENTS_PER_NICKEL;
		remainingAmount %= CENTS_PER_NICKEL;

		int pennies = remainingAmount;

		// step 3: print the results
		System.out.println("Your amount $" + money + " consists of");
		System.out.println("\t" + dollars + " dollars");
		System.out.println("\t" + quarters + " quarters");
		System.out.println("\t" + dimes + " dimes");
		System.out.println("\t" + nickels + " nickels");
		System.out.println("\t" + pennies + " pennies");
	}
}
