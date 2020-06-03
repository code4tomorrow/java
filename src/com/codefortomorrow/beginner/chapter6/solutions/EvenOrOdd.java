package com.codefortomorrow.beginner.chapter6.solutions;

/*
 * Use the modulus operator to check
 * whether an inputted number is even or odd.
 */

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int number = input.nextInt();

		if (number % 2 == 0) {
			System.out.println(number + " is even");
		} else {
			System.out.println(number + " is odd");
		}
	}
}
