package com.codefortomorrow.beginner.chapter6.solutions;

/*
 * Create a simple pick your path game
 * where you give the user a scenario
 * and different actions they can take.
 * You should have at least 3 scenarios.
 * Use your imagination to think of something cool!
 * Here's an example for the pick your path program:
 * https://youtu.be/5BFgBdzhaWg
 */

import java.util.Scanner;

public class PickYourPath {
	public static void main(String[] args) {
		final String PROMPT = "Enter 1, 2, or another number to quit: ";

		System.out.println("Welcome to Pick Your Path!");

		System.out.println("You are a master chef cooking in your restaurant\n" +
				"when suddenly one of the pans lights on fire! What do you do?");
		System.out.println("\t(1) Grab a bucket of water and douse the flames");
		System.out.println("\t(2) Call 911 and let the firefighters handle it");

		Scanner input = new Scanner(System.in);
		System.out.print(PROMPT);
		int choice = input.nextInt();

		if (choice == 1) {
			System.out.println("Oh no, it turns out that it was a grease fire\n" +
					"and spraying it with water made the fire bigger!\n" +
					"Everyone gets out of the building safely, but unfortunately\n" +
					"your restaurant partially burned down.");
			System.out.println("Game over!");
		} else if (choice == 2) {
			System.out.println("Good call. The firefighters were able to get\n" +
					"there in time to put out the dangerous grease fire.");

			System.out.println("Unfortunately, the entire fire fiasco has\n" +
					"backed up the cooking process and customers are getting\n" +
					"impatient. What do you do?");
			System.out.println("\t(1) Go to the dining area and personally\n" +
					"\tassure the customers that their food is coming");
			System.out.println("\t(2) Stay in the kitchen and work faster");

			System.out.print(PROMPT);
			choice = input.nextInt();

			if (choice == 1) {
				System.out.println("Your customers appreciated your tact and decide\n" +
						"to leave generous tips. Way to go!");

				System.out.println("How do you want to spend your profits?");
				System.out.println("\t(1) Invest in a new oven");
				System.out.println("\t(2) Book a vacation to Tahiti");

				System.out.print(PROMPT);
				choice = input.nextInt();

				if (choice == 1) {
					System.out.println("The oven you purchased had a defect,\n" +
							"and you wasted all of your money. :(");
				} else if (choice == 2) {
					System.out.println("You spent a relaxing week in an island\n" +
							"paradise and come back to your restaurant rejuvenated.\n" +
							"Your cooking is now even better, and your business\n" +
							"flourishes! :)");
				}
				System.out.println("You've reached the end of the game. Thanks for playing!");
			} else if (choice == 2) {
				System.out.println("Unfortunately, your efforts weren't enough\n" +
						"and customers got tired of waiting. Many of them left\n" +
						"or gave no tips.");
				System.out.println("Game over!");
			} else {
				System.out.println("Game over. Thanks for playing!");
			}
		} else {
			System.out.println("Game over. Thanks for playing!");
		}

		input.close();
	}
}
