package com.codefortomorrow.intermediate.chapter11.solutions;

import java.util.Scanner;

/*
Credit card numbers follow certain patterns. A credit card number
must have between 13 and 16 digits. It must start with:
■ 4 for Visa cards
■ 5 for Master cards
■ 37 for American Express cards
■ 6 for Discover cards

In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card
numbers. The algorithm is useful to determine whether a card number is entered
correctly or whether a credit card is scanned correctly by a scanner. Credit card
numbers are generated following this validity check, commonly known as the
Luhn check or the Mod 10 check, which can be described as follows
(for illustration, consider the card number 4388576018402626):

1. Double every second digit from right to left. If doubling of a digit results in a
two-digit number, add up the two digits to get a single-digit number.
4388576018402626
2 * 2 = 4
2 * 2 = 4
4 * 2 = 8
1 * 2 = 2
6 * 2 = 12 (1 + 2 = 3)
5 * 2 = 10 (1 + 0 = 1)
8 * 2 = 16 (1 + 6 = 7)
4 * 2 = 8

2. Now add all single-digit numbers from Step 1.
4 + 4 + 8 + 2 + 3 + 1 + 7 + 8 = 37

3. Add all digits in the odd places from right to left in the card number.
6 + 6 + 0 + 8 + 0 + 7 + 8 + 3 = 38

4. Sum the results from Step 2 and Step 3.
37 + 38 = 75

5. If the result from Step 4 is divisible by 10, the card number is valid; otherwise,
it is invalid. For example, the number 4388576018402626 is invalid, but the
number 4388576018410707 is valid.

Write a program that prompts the user to enter a credit card number as a long
integer. Display whether the number is valid or invalid. Design your program to
use the following methods:

Returns true if the card number is valid
public static boolean isValid(long number)

Gets the result from Step 2
public static int sumOfDoubleEvenPlace(long number)

Returns this number if it is a single digit, otherwise,
return the sum of the two digits
public static int getDigit(int number)

Returns sum of odd-place digits in number
public static int sumOfOddPlace(long number)

Returns true if the digit d is a prefix for number
public static boolean prefixMatched(long number, int d)

Returns the number of digits in d
public static int getSize(long d)

Returns the first k number of digits from number. If the
number of digits in number is less than k, return number.
public static long getPrefix(long number, int k)

Here are sample runs of the program:

Enter a credit card number: 4388576018410707
4388576018410707 is valid

Enter a credit card number: 4388576018402626
4388576018402626 is invalid

Bonus points if you can also print to the user
what type of card the number is, and for writing JavaDoc comments.

Note: If you need more card numbers to test, you can look here:
https://www.simplify.com/commerce/docs/testing/test-card-numbers
(or simply search "test credit card numbers" on Google).

Note: The practice template has method stubs written for you.
Simply delete the default return values and start coding!

Adapted from Exercise 6.31, Introduction to Java Programming (Comprehensive),
10th ed. by Y. Daniel Liang
*/

public class CreditCard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);		

        System.out.print("Enter a credit card number: ");
        long number = input.nextLong();
        
        // print whether the number is valid
        if (isValid(number)) {
            String cardType;
            
            // determine card type based on prefix
            if (prefixMatched(number, 4)) {
                cardType = "Visa";
            } else if (prefixMatched(number, 5)) {
                cardType = "Master";
            } else if (prefixMatched(number, 6)) {
                cardType = "Discover";
            } else {
                cardType = "American Express";
            }
            
            // display the card type
            System.out.println("That is a valid " + cardType + " card number.");
        } else {
            System.out.println("That is not a valid credit card number.");
        }
        
		input.close();
    }
	
	/**
	 * Returns true if the card number is valid
	 * @param number  credit card number
	 * @return true if the card number is valid
	 */
	public static boolean isValid(long number) {
		// number has a valid prefix if it begins with 4, 5, 6, or 37
		boolean prefixMatches = prefixMatched(number, 4)
			|| prefixMatched(number, 5)
			|| prefixMatched(number, 6)
			|| prefixMatched(number, 37);
		
		
		if (number < 0) {
			// if number is negative, it's invalid
			return false;
		} else if (getSize(number) < 13 || getSize(number) > 16) {
			// if number is NOT between 13 and 16 digits (inclusive), it's invalid
			return false;
		} else if (!prefixMatches) {
			// if the number does not have a valid prefix, it's invalid
			return false;
		} else {
			// if the number passes all of the other tests, 
			// do the Luhn check (aka Mod 10 check)
			int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
			return sum % 10 == 0;
		}
	}
	
	/**
	 * Returns the sum of the doubled even-place digits,
	 * from right to left
	 * @param number  credit card number
	 * @return the sum of the doubled even-place digits,
	 * from right to left
	 */
	public static int sumOfDoubleEvenPlace(long number) {
		int sum = 0;
				
		// start at the second-to-last digit
		number /= 10;
				
		int result;
		
		// while there are still digits remaining
		while (number != 0) {
			// get the rightmost digit
			int rightmostDigit = (int) (number % 10);
			
			// double it
			rightmostDigit *= 2;
			
			// the result is either the doubled value itself
			// or the sum of the two digits of doubled value
			result = getDigit(rightmostDigit);
			
			// add that result to the running sum
			sum += result;
			
			// move 2 digits to the left (the next even place)
			number /= 100;
		}
				
		return sum;
	}
	
	/**
	 * Returns the given number if it is a single digit,
	 * otherwise return the sum of the two digits
	 * @param n  a doubled even-place digit of a credit card number
	 * @return the given number if it is a single digit,
	 * otherwise the sum of the two digits
	 */
	public static int getDigit(int n) {				
		// if n is 2 digits
		if (n > 9) {
			// get the first and second digits
			int firstDigit = 1; // if n is 2 digits, n can only be from 10-18
			int secondDigit =  n % 10;
			
			// result is the sum of the 2 digits
			return firstDigit + secondDigit;
		} else {
			// if n is 1 digit, result is n itself
			return n;
		}				
	}
	
	/**
	 * Returns the sum of the odd-place digits,
	 * from right to left
	 * @param number  credit card number
	 * @return the sum of the odd-place digits,
	 * from right to left
	 */
	public static int sumOfOddPlace(long number) {
		int sum = 0;
		
		// while there are still digits remaining in number
		while (number != 0) {
			// get the rightmost digit
			int rightmostDigit = (int) (number % 10);
			
			// add the rightmost digit to the sum
			sum += rightmostDigit;
			
			// move 2 digits to the left (the next odd place)
			number /= 100;
		} 
		
		return sum;
	}

	/**
	 * Returns true if d is a prefix for a number 
	 * @param number  credit card number
	 * @param d  credit card number prefix
	 * @return true if d is a prefix for a number
	 */
	public static boolean prefixMatched(long number, int d) {
		return getPrefix(number, getSize(d)) == d;
	}
	
	/**
	 * Return the number of digits in the given number
	 * @param number  a long integer
	 * @return the number of digits in the given number
	 */
	public static int getSize(long number) {
		int numberOfDigits = 0;

		while (number != 0) {
			number /= 10;
			numberOfDigits++;
		}
		
		return numberOfDigits;
	}
	
	/**
	 * Return the first k number of digits from number.
	 * If the number of digits in number is less than k, 
	 * return number.
	 * @param number  credit card number
	 * @param k  number of first digits to retrieve from number
	 * @return the first k number of digits from number.
	 * If the number of digits in number is less than k,
	 * returns number.
	 */
	public static long getPrefix(long number, int k) {
		// If the number of digits in number is less than k,
		// return number
		if (getSize(number) < k) {
			return number;
		} else {
			// keep removing rightmost digits
			// until the length of the number is equal to k
			while (getSize(number) > k) {
				number /= 10;
			}
			
			// once loop ends, number is the prefix
			return number;
		}
	}
}