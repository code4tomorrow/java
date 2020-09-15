package com.codefortomorrow.beginner.chapter3.solutions;

/*
 * Given 3 strings of even length, print
 * the first half of each string.
 *
 * Hint: Use the length() method on
 * a string to get the number of
 * characters that make up that string.
 * https://www.tutorialspoint.com/java/java_string_length.htm
 *
 * Adapted from firstHalf (CodingBat)
 * https://codingbat.com/prob/p172267
 */

public class FirstHalf {

    public static void main(String[] args) {
        String str1 = "WooHoo";
        String str2 = "HelloThere";
        String str3 = "abcdef";

        System.out.println(str1.substring(0, str1.length() / 2)); // prints "Woo"
        System.out.println(str2.substring(0, str2.length() / 2)); // prints "Hello"
        System.out.println(str3.substring(0, str3.length() / 2)); // prints "abc"
    }
}
