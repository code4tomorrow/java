package com.codefortomorrow.advanced.chapter13.examples;

public class Fibonacci {
    public static int fibonacciRecursion(int nthNumber) {
        //use recursion
        if (nthNumber == 0) {
            return 0;
        } else if (nthNumber == 1) {
            return 1;
        }
        return fibonacciRecursion(nthNumber - 1) + fibonacciRecursion(nthNumber - 2);
    }

    public static int fibonacciLoop(int nthNumber) {
        //use loop
        int previouspreviousNumber, previousNumber = 0, currentNumber = 1;
        for (int i = 1; i < nthNumber ; i++) {
            previouspreviousNumber = previousNumber;
            previousNumber = currentNumber;
            currentNumber = previouspreviousNumber + previousNumber;
        }
        return currentNumber;
    }

    // Credit: https://dev.to/khalilsaboor/fibonacci-recursion-vs-iteration--474l
}
