package com.codefortomorrow.beginner.chapter9.examples;

public class IterateArray {
	public static void main(String[] args) {
		// initialize array
		int[] numbers = {12, 34, 56, 78, 90};

		// for loop
		for (int index = 0; index < numbers.length; index++) {
			System.out.println(numbers[index]);
		}

		System.out.println();

		// for each loop
		for (int n: numbers) {
			System.out.println(n);
		}
	}
}
