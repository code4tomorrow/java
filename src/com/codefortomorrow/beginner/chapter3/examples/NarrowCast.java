package com.codefortomorrow.beginner.chapter3.examples;

/*
 * Adapted from W3Schools Java Type Casting
 * https://www.w3schools.com/java/java_type_casting.asp
 */

public class NarrowCast {
	public static void main(String[] args) {
		double myDouble = 9.78;
		int myInt = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9
	}
}
