package com.codefortomorrow.intermediate.chapter11.solutions;

public class PrintEvens {

    /**
     * Difficulty: 2
     *
     * Print the first n even integers
     * (consider 0 an even number)
     * @param n number of even integers to print
     */
    public static void printEvens(int n) {
        int evens = 0;
        int i = 0;
        while (evens < n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evens++;
            }
            i++;
        }
    }
}
