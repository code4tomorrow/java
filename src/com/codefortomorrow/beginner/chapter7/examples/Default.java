package com.codefortomorrow.beginner.chapter7.examples;

import java.util.Scanner;

public class Default {
	public static void main(String[] args) {
		// print greeting options
		System.out.println("Greetings:");
		System.out.println("\t(1) Star Wars");
		System.out.println("\t(2) Agents of SHIELD");
		System.out.println("\t(3) Star Trek");
		System.out.println("\t(4) Six of Crows");

		// prompt user to choose a greeting
		Scanner input = new Scanner(System.in);
		System.out.print("Which greeting do you want? ");
		int choice = input.nextInt();
		input.close();

		// print the correct greeting, or an error message
		// if the choice was invalid
		switch (choice) {
			case 1:
				System.out.println("May the Force be with you.");
				break;
			case 2:
				System.out.println("Tahiti, it's a magical place.");
				break;
			case 3:
				System.out.println("Live long and prosper.");
				break;
			case 4:
				System.out.println("No mourners, no funerals.");
				break;
			default:
				System.out.println("Error, invalid greeting number.");
		}
	}
}
