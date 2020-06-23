package com.codefortomorrow.beginner.chapter8.examples;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = input.nextInt();
		input.close();

		// prints num, num - 1, num - 2, ... , 1
		while (num > 0) {
			System.out.println(num--);
		}
	}
}
