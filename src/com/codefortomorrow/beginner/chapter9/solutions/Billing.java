package com.codefortomorrow.beginner.chapter9.solutions;

/*
 * Create a program called Billing which
 * prompts the user for the number of items
 * they will enter. Then ask the user for
 * the name of the item and price repeatedly.
 * Once the last item and its price has been
 * entered, print a receipt which has each item
 * and its price, as well as the subtotal, tax,
 * and total. (The sales tax rate is 8%.)
 * Hint: Use an array to store the item names and prices.
 *
 * Sample output:
 * Enter the number of items: 3
 * Enter item #1: shirt
 * Enter price of item #1: $15.43
 * Enter item #2: pants
 * Enter price of item #2: $12.38
 * Enter item #3: hat
 * Enter price of item #3: $4.99
 *
 * RECEIPT
 * --------------------------------------
 * shirt - $15.43
 * pants - $12.38
 * hat - $4.99
 * --------------------------------------
 * Subtotal: $32.80
 * Tax:      $2.62
 * Total:    $35.42
 *
 * Hint: You may encounter a problem when using Scanner.
 * Read the following article for a solution:
 * https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
 */

import java.util.Scanner;

public class Billing {
	public static void main(String[] args) {
		final double TAX_RATE = 0.08;
		final String DIVIDER = "--------------------------------------";

		Scanner input = new Scanner(System.in);

		// prompt user for # of items
		System.out.print("Enter the number of items: ");
		int numberOfItems = input.nextInt();
		input.nextLine(); // to move cursor to next line

		// create arrays to store item names and prices
		String[] items = new String[numberOfItems];
		double[] prices = new double[numberOfItems];

		// prompt user to enter item names and prices
		// and store them in the items and prices arrays
		for (int i = 0; i < numberOfItems; i++) {
			System.out.print("Enter item #" + (i + 1) + ": ");
			items[i] = input.nextLine();

			System.out.print("Enter price of item #" + (i + 1) + ": $");
			prices[i] = input.nextDouble();

			input.nextLine(); // to move cursor to next line
		}

		// calculate subtotal, tax, and total
		double subtotal = 0;
		for (double price: prices) {
			subtotal += price;
		}

		double tax = subtotal * TAX_RATE;
		double total = subtotal + tax;

		// print the receipt
		System.out.println("\nRECEIPT");
		System.out.println(DIVIDER);

		// print items and prices
		for (int i = 0; i < numberOfItems; i++) {
			System.out.printf("%s - $%.2f\n", items[i], prices[i]);
		}
		System.out.println(DIVIDER);

		// print subtotal, tax, and total
		System.out.printf("Subtotal: $%.2f\n", subtotal);
		System.out.printf("Tax:      $%.2f\n", tax);
		System.out.printf("Total:    $%.2f\n", total);
	}
}
