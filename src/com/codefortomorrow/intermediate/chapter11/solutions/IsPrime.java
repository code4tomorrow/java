package com.codefortomorrow.intermediate.chapter11.solutions;

/*
Write a method called isPrime which returns
true if the given integer is prime and false otherwise.
Bonus points for writing JavaDoc comments for the method.

Test your isPrime method in the main method by
calling it at least 3 times and printing the result.

Solution from Listing 6.7, Introduction to Java Programming (Comprehensive),
10th ed. by Y. Daniel Liang
*/

public class IsPrime {

    public static void main(String[] args) {
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(1)); // false
        System.out.println(isPrime(56)); // false
    }

    /**
     * Check whether number is prime
     * @param number  number to check if prime
     * @return true if the number is prime
     */
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        // only need to check divisors up to sqrt(number)
        // because after that the factors "repeat"
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) { // primes only divisible by 1 and itself
                return false; // number isn't a prime
            }
        }
        return true; // number is a prime
    }
}
