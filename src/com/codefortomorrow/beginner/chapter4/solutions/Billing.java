package com.codefortomorrow.beginner.chapter4.solutions;

/*
 * Make a program that sets the prices of 3 items.
 *
 * Your program should then print the price of each
 * item and the sum of the prices (subtotal).
 *
 * Then, apply an 8% sales tax on the subtotal.
 * (To do this, multiply the subtotal by 0.08.)
 * Print the tax.
 *
 * Then sum the subtotal and tax to get the total.
 * Print the total.
 *
 * Output should be the following:
 *
 * Item 1 costs $5.25
 * Item 2 costs $7.25
 * Item 3 costs $10.5
 *
 * Subtotal: $23.0
 * Tax: $1.84
 * Total: $24.84
 */

public class Billing {

    public static void main(String[] args) {
        // sales tax is 8%
        final double TAX_RATE = 0.08;

        // set prices for the 3 items
        double item1 = 5.25;
        double item2 = 7.25;
        double item3 = 10.5;

        // calculate subtotal, tax, and total
        double subtotal = item1 + item2 + item3;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        // display the prices of the 3 items
        System.out.println("Item 1 costs $" + item1);
        System.out.println("Item 2 costs $" + item2);
        System.out.println("Item 3 costs $" + item3);

        System.out.println();

        // display the subtotal, tax, and total
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
    }
}
