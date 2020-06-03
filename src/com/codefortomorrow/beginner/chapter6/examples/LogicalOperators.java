package com.codefortomorrow.beginner.chapter6.examples;

public class LogicalOperators {
	public static void main(String[] args) {
		int age = 24;
		int weight = 140;

		// logical AND - &&
		System.out.println((age > 28) && (weight <= 140)); // false
		System.out.println((age > 18) && (weight >= 140)); // true

		// logical OR - ||
		System.out.println((age > 34) || (weight >= 150)); // false
		System.out.println((age > 18) || (weight < 140)); // true

		// logical XOR - ^
		System.out.println((age > 34) ^ (weight > 140)); // false
		System.out.println((age > 34) ^ (weight >= 140)); // true

		// logical NOT - !
		System.out.println(!(age > 18)); // false
		System.out.println(!(weight == 150)); // true
	}
}
