package com.codefortomorrow.beginner.chapter6.examples;

import java.util.Scanner;

public class Vote {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = input.nextInt();

		boolean canVote = age >= 18;

		// if statement
		if (canVote) {
			System.out.println("You can vote!");
		}

		// if-else statement
		if (canVote) {
			System.out.println("You can vote!");
		} else {
			System.out.println("Sorry, you can't vote yet.");
		}

		// else if
		if (canVote) {
			System.out.println("You can vote!");
		} else if (age >= 16) {
			System.out.println("In California, you can register to vote.");
		} else {
			System.out.println("Sorry, you can't vote yet or register to vote in California.");
		}
	}
}
