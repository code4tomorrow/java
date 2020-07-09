package com.codefortomorrow.beginner.chapter6.solutions;

/*
 * Adjust the billing project so that the program
 * asks the user the name of the item and the price
 * of the item. Next, if the price is greater than $10,
 * then apply a 5% off discount, otherwise if the price
 * is greater than $25, apply a 10% off discount.
 * Then print the name of the item, original price,
 * discount amount, subtotal (discounted price),
 * tax (8% of the discounted price), and total (subtotal + tax).
 *
 * Example output:
 * Enter the name of the item: Pizza
 * Enter the price of the item: $12
 *
 * RECEIPT
 * Item: Pizza
 * Price: $12.00
 * Discount: $0.60
 * ---------------------------
 * Subtotal: $11.40
 * Tax: $0.96
 * Total: $12.36
 *
 * Note: In order to achieve the output above,
 * you will need to use String formatting to ensure
 * that monetary amounts are displayed to 2 decimals
 * of precision. You can read more about that here:
 * https://dzone.com/articles/java-string-format-examples
 * If you don’t know how to use String formatting,
 * that’s ok too, just print things normally.
 */

import java.util.Scanner;

public class Billing {

    public static void main(String[] args) {
        final double TAX_RATE = 0.08;

        // prompt user for the item name and price
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name of the item: ");
        String itemName = input.nextLine();

        System.out.print("Enter the price of the item: $");
        double price = input.nextDouble();

        input.close();

        // apply a discount if needed
        double discount = 0;
        if (price > 10) {
            // 5% off discount
            discount = price * 0.05;
        } else if (price > 25) {
            // 10% off discount
            discount = price * 0.1;
        }

        // calculate the subtotal, tax, and total
        double subtotal = price - discount;
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;

        // display item name, price, discount,
        // subtotal, tax, and total
        System.out.println("\nRECEIPT");
        System.out.println("Item: " + itemName);
        System.out.printf("Price: $%.2f\n", price);
        System.out.printf("Discount: $%.2f\n", discount);
        System.out.println("---------------------------");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
