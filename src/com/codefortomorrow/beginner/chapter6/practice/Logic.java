package com.codefortomorrow.beginner.chapter6.practice;

/*
 * Given the code below, predict what the output
 * of this program will be. Write your answers
 * as comments on the program next to the print
 * statements.
 */

public class Logic {
	public static void main(String[] args) {
		int z = 5;
		int y = 25;

		System.out.println(z < 10 && y == z * 5);
		System.out.println(z < 10 && y != z * 5);
		System.out.println(z < 10 || y == z * 5);
		System.out.println(z < 10 || y != z * 5);

		System.out.println(y == z * 5);
		System.out.println(y != z * 5);
	}
}
