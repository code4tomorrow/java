package com.codefortomorrow.intermediate.chapter11.solutions;

import java.util.Scanner;

/*
Create a class named Triangle that contains the following two methods:

Return true if the sum of any two sides is greater than the third side.
(This is the definition of a valid triangle.)
public static boolean isValid(double side1, double side2, double side3)

Return the area of the triangle.
public static double area(double side1, double side2, double side3)

Write a test program that reads three sides for a triangle
and computes the area if the sides form a valid triangle.
Otherwise, it displays that the input is invalid.
Use Heron's Formula to calculate the area of a triangle given 3 sides:
https://www.mathsisfun.com/geometry/herons-formula.html

Adapted from Exercise 6.19, Introduction to Java Programming (Comprehensive),
10th ed. by Y. Daniel Liang
*/

public class Triangle {

    public static void main(String[] args) {
        // prompt user to enter triangle side lengths
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1: ");
        double side1 = input.nextDouble();

        System.out.print("Enter side 2: ");
        double side2 = input.nextDouble();

        System.out.print("Enter side 3: ");
        double side3 = input.nextDouble();

        input.close();

        // if sides form a valid triangle, print area
        // else, print error message
        if (isValid(side1, side2, side3)) {
            double area = area(side1, side2, side3);
            System.out.println("The area of the triangle is: " + area);
        } else {
            System.out.println(
                "Invalid input. Those sides don't form a triangle."
            );
        }
    }

    /**
     * Returns whether the given side lengths form a valid triangle
     * @param side1  triangle's first side
     * @param side2  triangle's second side
     * @param side3  triangle's third side
     * @return true if the given side lengths form a valid triangle
     */
    public static boolean isValid(double side1, double side2, double side3) {
        return (
            (side1 + side2 > side3) &&
            (side1 + side3 > side2) &&
            (side2 + side3 > side3)
        );
    }

    /**
     * Returns the area of a triangle given its three side lengths
     * @param side1  triangle's first side
     * @param side2  triangle's second side
     * @param side3  triangle's third side
     * @return the area of the triangle
     */
    public static double area(double side1, double side2, double side3) {
        // calculate semiperimeter
        double s = (side1 + side2 + side3) / 2;

        // return area
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
