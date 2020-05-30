package com.codefortomorrow.intermediate.chapter10.solutions;

/*
Create a class called Palindrome.
In the main method, prompt the user to
enter a word. Then print whether the word
given is a palindrome.

Note: Your program should disregard all
leading and trailing whitespace, and should
be case insensitive.

Example output 1:

Enter a word:     RaCecAr
The word is a palindrome.

Example output 2:

Enter a word: hello
The word is NOT a palindrome.
 */

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		// get a word from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");

		// trim leading and trailing whitespace
		// and make the word lowercase
		String word = input.nextLine().trim().toLowerCase();
		input.close();

		int low = 0; // low index of the word
		int high = word.length() - 1; // high index of the word
		boolean isPalindrome = true;

		if (word.isEmpty()) {
			isPalindrome = false;
		} else {
			while (low < high) {
				// check if chars at low and high indices are matching
				if (word.charAt(low) != word.charAt(high)) {
					isPalindrome = false;
					break;
				}
				low++;
				high--;
			}
		}

		if (isPalindrome) {
			System.out.println("The word is a palindrome.");
		} else {
			System.out.println("The word is NOT a palindrome.");
		}
	}
}
