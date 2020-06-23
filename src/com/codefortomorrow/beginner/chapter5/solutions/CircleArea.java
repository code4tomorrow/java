package com.codefortomorrow.beginner.chapter5.solutions;

/*
 * Create a program called CircleArea
 * which prompts the user to enter
 * the radius of a circle.
 *
 * Compute the area of the circle
 * and display the result.
 */

import java.util.Scanner;

public class CircleArea {
	public static void main(String[] args) {
		// prompt user to enter a radius
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		double radius = input.nextDouble();

		// calculate and display the circle's area
		double area = Math.PI * radius * radius;
		System.out.println("Area of the circle is: " + area);

		input.close();
	}
}
