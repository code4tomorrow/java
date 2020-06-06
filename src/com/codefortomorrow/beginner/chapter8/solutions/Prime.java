package com.codefortomorrow.beginner.chapter8.solutions;

/*
 * Create a program called Prime
 * which prompts the user to enter the
 * number of prime numbers they wish to
 * have displayed (let this be numberOfPrimes).
 * Then display the first numberOfPrimes prime
 * numbers such that there are 10 primes
 * displayed per line.
 *
 * Sample output:
 *
 * Enter the number of primes you want to print: 15
 * The first 15 prime numbers are
 *
 * 2 3 5 7 11 13 17 19 23 29
 * 31 37 41 43 47
 *
 * Note: An integer is prime if it is greater than
 * 1 and its only positive divisor is 1 or itself.
 * For example, 2, 3, 5, and 7 are prime, but
 * 4, 6, 8, and 9 are not.
 *
 * Hint: This problem is difficult and requires
 * you to solve multiple problems. The key to this
 * is to break it down into the following tasks:
 *
 * - Determine whether a given number is prime
 * - For number = 2, 3, 4, 5, 6 ... , etc., test whether it is prime
 * - Count the prime numbers (so that you can print 10 on each line)
 * - Display each prime number, and display 10 numbers per line
 *
 * We highly recommend that for this problem, you plan out
 * your program rather than writing it out by scratch right out
 * of the gate. Programmers often do this with a technique called
 * pseudocode, where you write your program out with comments
 * in regular English about what you plan to do.
 *
 * Adapted from Listing 5.15 PrimeNumber.java from
 * Introduction to Java Programming (Comprehensive), 10th ed.
 * by Y. Daniel Liang
 */

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		final int NUMBER_OF_PRIMES_PER_LINE = 10; // display 10 per line
		int count = 0; // count the number of prime numbers
		int number = 2; // a number to be tested for primeness

		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of primes you want to print: ");
		int numberOfPrimes = input.nextInt();

		System.out.println("The first " + numberOfPrimes + " prime numbers are \n");

		// repeatedly find prime numbers
		while (count < numberOfPrimes) {
			// assume the number is prime
			boolean isPrime = true; // is the current number prime?

			// test whether number is prime
			for (int divisor = 2; divisor <= number / 2; divisor++) {
				if (number % divisor == 0) { // if true, number isn't prime
					isPrime = false;
					break; // exit for loop
				}
			}

			// display the prime number and increase the count
			if (isPrime) {
				count++;

				if (count % NUMBER_OF_PRIMES_PER_LINE == 0) { // reached 10 numbers in one line
					// display the number and advance to the new line
					System.out.println(number);
				} else {
					// print on the same line if 10 haven't been printed
					// on this line yet
					System.out.print(number + " ");
				}
			}

			// check if the next number is prime
			number++;
		}
	}
}
