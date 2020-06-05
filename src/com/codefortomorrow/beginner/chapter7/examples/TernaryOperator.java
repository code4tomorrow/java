package com.codefortomorrow.beginner.chapter7.examples;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		// Ask user if it's a leap year
		Scanner input = new Scanner(System.in);
		System.out.print("Is it a leap year? Enter true or false: ");
		boolean isLeapYear = input.nextBoolean();

		// Choose the correct number of days in February
		int days;
//		if (isLeapYear) {
//			days = 29;
//		} else {
//			days = 28;
//		}

		// same as above, but shorter
		//      condition	if : else
		days = isLeapYear ? 29 : 28;

		System.out.println("There are " + days + " days in February.");
	}
}
