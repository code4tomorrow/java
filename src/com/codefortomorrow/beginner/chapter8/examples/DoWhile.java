package com.codefortomorrow.beginner.chapter8.examples;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		final int SECRET_NUMBER = 12;

		System.out.println("Welcome to the guessing game!");
		System.out.println("Guess the correct positive integer or -1 to quit.");

		Scanner input = new Scanner(System.in);

		int guess;
		do {
			// prompt user for their guess
			System.out.print("Enter your guess: ");
			guess = input.nextInt();
		} while (guess != SECRET_NUMBER && guess != -1);

		input.close();

		if (guess == SECRET_NUMBER) { // user guessed correctly
			System.out.println("Good job, you guessed right!");
		} else { // user quit
			System.out.println("The secret number was " + SECRET_NUMBER);
		}
	}
}
