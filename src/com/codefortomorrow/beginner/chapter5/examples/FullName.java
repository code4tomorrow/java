package com.codefortomorrow.beginner.chapter5.examples;

import java.util.Scanner;

public class FullName {
	public static void main(String[] args) {
		// create a Scanner object called input
		Scanner input = new Scanner(System.in);

		// prompt the user for their first name
		System.out.print("What is your first name? ");

		// read the input as a String
		String firstName = input.nextLine();

		// prompt the user for their last name
		System.out.print("What is your last name? ");

		// read the input as a String
		String lastName = input.nextLine();

		// print the user's full name
		System.out.println("Your full name is " + firstName + " " + lastName);

		input.close();
	}
}
