package com.codefortomorrow.intermediate.chapter11.solutions;

import java.util.Scanner;

/*
Write a class that contains the following two methods:

Convert from Celsius to Fahrenheit
public static double celsiusToFahrenheit(double celsius)

Convert from Fahrenheit to Celsius
public static double fahrenheitToCelsius(double fahrenheit)

The formula for the conversion is:
fahrenheit = (9.0 / 5) * celsius + 32
celsius = (5.0 / 9) * (fahrenheit – 32)

Bonus points for writing JavaDoc comments for both methods.

Write a test program that asks the user for a temperature
in Fahrenheit and prints out the Celsius conversion. Then
ask the user for a temperature in Celsius and print out
the Fahrenheit conversion.

Adapted from Exercise 6.8, Introduction to Java Programming (Comprehensive),
10th ed. by Y. Daniel Liang
*/

public class Temperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prompt user for temp in deg F
        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // print that temp in deg C
        System.out.println(
            fahrenheit +
            " deg F is " +
            fahrenheitToCelsius(fahrenheit) +
            " deg C"
        );

        // prompt user for temp in deg C
        System.out.print("Enter the temperature in degrees Celsius: ");
        double celsius = input.nextDouble();

        // print that temp in deg F
        System.out.println(
            celsius + " deg C is " + celsiusToFahrenheit(celsius) + " deg F"
        );

        input.close();
    }

    /**
     * Convert from Celsius to Fahrenheit
     * @param celsius  temperature in degrees Celsius
     * @return temperature in degrees Fahrenheit
     */
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    /**
     * Convert from Fahrenheit to Celsius
     * @param fahrenheit  temperature in degrees Fahrenheit
     * @return temperature in degrees Celsius
     */
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
