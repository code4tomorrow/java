package com.codefortomorrow.beginner.chapter9.solutions;

/*
 * Create a program called AddressBook
 * which prompts the user to enter
 * 5 addresses. The program should prompt the user
 * for the house number (int), street (String),
 * apartment (char), and zip code (int).
 *
 * Note that there is no nextChar() method
 * in the Scanner class, so you will need to do
 * something like this:
 * Scanner input = new Scanner(System.in);
 * char apt = input.nextLine().charAt(0);
 *
 * It should then print each of the addresses. If
 * the user entered '-' for the apartment, the apartment
 * should not be printed (see sample output).
 *
 * The zip codes should always be printed so that
 * they are 5 digits long. (You may need to use
 * String formatting so that if the zip code
 * is not 5 digits, it will fill in 0s to the left
 * of the number until the entire zip code is 5 digits
 * long. You can read about that here:
 * https://stackoverflow.com/questions/473282/how-can-i-pad-an-integer-with-zeros-on-the-left)
 *
 * Sample output: https://youtu.be/ms2tM-llTwo
 *
 * Hint: You may encounter a problem when using Scanner.
 * Read the following article for a solution:
 * https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/
 */

import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {
        final int NUMBER_OF_ADDRESSES = 5;

        // arrays store the address info
        int[] number = new int[NUMBER_OF_ADDRESSES];
        String[] street = new String[NUMBER_OF_ADDRESSES];
        char[] apartment = new char[NUMBER_OF_ADDRESSES];
        int[] zipCode = new int[NUMBER_OF_ADDRESSES];

        Scanner input = new Scanner(System.in);

        // prompt user for each address and store it
        for (int i = 0; i < NUMBER_OF_ADDRESSES; i++) {
            System.out.println("Address #" + (i + 1));

            System.out.print("Enter the house number: ");
            number[i] = input.nextInt();

            input.nextLine(); // move cursor to next line

            System.out.print("Enter the street: ");
            street[i] = input.nextLine();

            System.out.print(
                "Enter the apartment, or '-' if apartment is not applicable: "
            );
            apartment[i] = input.nextLine().charAt(0);

            System.out.print("Enter the zip code: ");
            zipCode[i] = input.nextInt();

            System.out.println();
        }

        input.close();

        System.out.println("Address Book\n");

        // print out each address
        for (int i = 0; i < NUMBER_OF_ADDRESSES; i++) {
            System.out.print(number[i] + " " + street[i] + " ");

            // if apartment is '-', don't print the apartment
            if (apartment[i] != '-') {
                System.out.print("Apt " + apartment[i] + " ");
            }

            // pad zeroes to the left so that zip codes are
            // 5 digits long
            System.out.printf("%05d\n", zipCode[i]);
        }
    }
}
