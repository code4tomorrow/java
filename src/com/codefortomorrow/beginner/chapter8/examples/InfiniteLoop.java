package com.codefortomorrow.beginner.chapter8.examples;

public class InfiniteLoop {
	public static void main(String[] args) {
		int i = 3;

		// infinite loop! i is always greater than 0
//		while (i > 0) {
//			System.out.println(i);
//		}

		// fixed - be sure to change your control variables
		while (i > 0) {
			System.out.println(i);
			i--;
		}
	}
}
