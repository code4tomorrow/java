package com.codefortomorrow.beginner.chapter9.examples;

public class InitializeArray {
	public static void main(String[] args) {
		// declare an array - can be initialized later
		// with either of the initialization methods below
		// int[] a;

		// declare and initialize array with length
		int[] a = new int[3];
		a[0] = 97; // assign elements manually
		a[1] = 62;
		a[2] = 85;

		// declare and initialize array with elements (identical to a)
		int[] b = {97, 62, 85};
	}
}
