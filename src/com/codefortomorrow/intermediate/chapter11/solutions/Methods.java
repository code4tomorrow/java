package com.codefortomorrow.intermediate.chapter11.solutions;

public class Methods {

    /**
     * Difficulty: 1
     * 
     * Returns the average of two doubles
     * @param a the first double
     * @param b the second double
     * @return average
     */
    public static double average(double a, double b) {
        return (a + b)/2;
    }

    /**
     * Difficulty: 2
     *
     * Print the first n even integers
     * @param n number of even integers to print
     */
    public static void printEvens(int n) {
        int evens = 0;
        int i = 0;
        while (evens < n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                n++;
            }
            i++;
        }
    }
}
