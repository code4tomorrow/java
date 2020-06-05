package com.codefortomorrow.beginner.chapter3.solutions;

/*
 * Given 3 strings that are at least 2
 * characters long, print each string
 * without its first and last character.
 *
 * Hint: Use the length() method on
 * a string to get the number of
 * characters that make up that string.
 * https://www.tutorialspoint.com/java/java_string_length.htm
 *
 * Adapted from withoutEnd (CodingBat)
 * https://codingbat.com/prob/p130896
 */

public class WithoutEnd {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "java";
		String str3 = "coding";

		System.out.println(str1.substring(1, str1.length() - 1)); // prints "ell"
		System.out.println(str2.substring(1, str2.length() - 1)); // prints "av"
		System.out.println(str3.substring(1, str3.length() - 1)); // prints "odin"
	}
}
