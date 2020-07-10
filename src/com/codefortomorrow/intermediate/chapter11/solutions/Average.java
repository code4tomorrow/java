package com.codefortomorrow.intermediate.chapter11.solutions;

/*
Code a method called average that takes
two double parameters, a and b.
The method should return the average
of the two doubles.

Test if your average method works in the
main method by calling it at least 3 times
with different arguments and printing the results.

Bonus points if you write a JavaDoc comment for
the average() method.
*/

public class Average {

    public static void main(String[] args) {
        // test the average method
        System.out.println(average(5, 4)); // prints 4.5
        System.out.println(average(0, 10)); // prints 5.0
        System.out.println(average(1.5, 3.75)); // prints 2.625
    }

    /**
     * Returns the average of two doubles
     * @param a the first double
     * @param b the second double
     * @return the average of two doubles
     */
    public static double average(double a, double b) {
        return (a + b) / 2;
    }
}
