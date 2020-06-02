package com.codefortomorrow.beginner.chapter3.examples;

public class NonPrimitives {
	public static void main(String[] args) {
		// strings
		String username = "JYOTI";
		String password = "rani";

		System.out.println("Username: " + username);
		System.out.println("Password: " + password);

		// string methods
		System.out.println(username.toLowerCase());
		System.out.println(password.toUpperCase());
		System.out.println(username.substring(0, 4));
		System.out.println(username.charAt(3));

		// strings are immutable - even after method calls,
		// username and password remain unchanged
		System.out.println("Username: " + username);
		System.out.println("Password: " + password);

		// arrays preview
		int[] numbers = {4, 5, 1, -1, 10, 6};
		System.out.println("Element at index 2: " + numbers[2]);
	}
}
