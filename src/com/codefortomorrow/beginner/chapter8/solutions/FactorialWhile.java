package com.codefortomorrow.beginner.chapter8.solutions;

/*
 * Create a class called FactorialWhile
 * which takes an integer >= 0 and
 * prints the factorial of that integer.
 * (The factorial of 4 is 4 * 3 * 2 * 1 = 24.
 * Factorial is denoted with an exclamation point,
 * like so: 4! = 24.)
 * You should use a while loop to calculate the factorial.
 *
 * Sample output:
 * Enter an integer: 5
 * 5! = 120
 */

import java.util.Scanner;

public class FactorialWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0 or a positive integer:  ");
		int n = input.nextInt();
		input.close();
		int original = n; // store original to print the result later

		int product = 1;
		while (n > 1) {
			product *= n;
			n--;
		}

		System.out.println(original + "! = " + product);
	}
}
