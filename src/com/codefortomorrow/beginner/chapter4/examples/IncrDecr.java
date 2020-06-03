package com.codefortomorrow.beginner.chapter4.examples;

public class IncrDecr {
	public static void main(String[] args) {
		int i = 1;
		int j;

		// increment
		j = ++i; // j is 2, i is 2
		System.out.println("j: " + j + ", i: " + i);

		i = 1; // reset
		j = i++; // j is 1, i is 2
		System.out.println("j: " + j + ", i: " + i);

		// decrement
		i = 1; // reset
		j = --i; // j is 0, i is 0
		System.out.println("j: " + j + ", i: " + i);

		i = 1; // reset
		j = i--; // j is 1, i is 0
		System.out.println("j: " + j + ", i: " + i);
	}
}
