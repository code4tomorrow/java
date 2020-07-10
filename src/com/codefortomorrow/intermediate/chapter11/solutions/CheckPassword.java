package com.codefortomorrow.intermediate.chapter11.solutions;

import java.util.Scanner;

/*
Some websites impose certain rules for passwords.
Write a method that checks whether a string is a valid password.

Suppose the password rules are as follows:
■ A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.

Write a program that prompts the user to enter a password and displays
Valid Password if the rules are followed or Invalid Password otherwise.
To do this, use a method called isValid which returns true if the password
is valid and false otherwise.

You may also find it helpful to write a method called
isAlphanumeric which returns true if the given string
is only made up of letters and digits.

You may also find it helpful to write a method called
getNumberOfDigits which returns the number of digits
in a given string.

You may also find it helpful to use the Character.isDigit(char)
and Character.isDigit(char) methods. You can read more about them here:
https://www.tutorialspoint.com/java/java_characters.htm

If you don't want to use those methods, you can also use regular
expressions (aka regex) and the matches(regex) String method.
You can read about that here:
https://www.tutorialspoint.com/java/java_string_matches.htm
https://www.vogella.com/tutorials/JavaRegularExpressions/article.html

Bonus points for writing JavaDoc comments for the methods.

Adapted from Exercise 6.18, Introduction to Java Programming (Comprehensive),
10th ed. by Y. Daniel Liang
*/

public class CheckPassword {
    public static void main(String[] args) {
        // prompt user for a password
        Scanner input = new Scanner(System.in);
        System.out.print("Password: ");
        String password = input.nextLine();
        input.close();

        // print whether it's valid
        if (isValid(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
    
    /**
     * Check if a password is valid.
     * A valid password must:
     * - Contain at least 8 characters
     * - Be alphanumeric
     * - Contain at least 2 digits
     * @param password  password to check if valid
     * @return true if the password is valid
     */
    public static boolean isValid(String password) {
        boolean atLeastEightChars = password.length() >= 8;
        boolean isAlphanumeric = isAlphanumeric(password);
        boolean atLeastTwoDigits = getNumberOfDigits(password) >= 2;

        return atLeastEightChars && isAlphanumeric && atLeastTwoDigits;
    }

    /**
     * Check if a String is alphanumeric
     * (contains only letters and numbers)
     * @param str  String to check if alphanumeric
     * @return true if the String is alphanumeric
     */
    public static boolean isAlphanumeric(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isDigit = Character.isDigit(str.charAt(i));
            boolean isLetter = Character.isLetter(str.charAt(i));
            if (!isDigit && !isLetter) {
                return false;
            }
        }
        return true;

        // alternate solution using regular expressions
        // matches lowercase and uppercase letters, and digits
        // the + indicates the pattern must match 1 or more times
        // (need to check each char in the string)
        // return str.matches("[a-zA-Z0-9]+");
    }

    /**
     * Returns the number of digits
     * contained in the given String
     * @param str  String to get number of digits
     * @return the number of digits contained in the given String
     */
    public static int getNumberOfDigits(String str) {
        int numberOfDigits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                numberOfDigits++;
            }
        }
        return numberOfDigits;
    }
}