package com.codefortomorrow.intermediate.chapter10.solutions;

import java.util.Scanner;

/*
 * Create a driver class called TestSelectionSort
 * which prompts the user to enter the length of
 * an array and the elements (doubles) in the array.
 * Then, your program should use selection sort to
 * sort the array in place, and then print the resulting array.
 *
 * Example output:
 *
 * Enter the length of the array: 5
 * Enter the elements in the array: -1 236.3 2 6 0
 * -1.0 0.0 2.0 6.0 236.3
 */

public class TestSelectionSort {

    public static void main(String[] args) {
        // Prompt user for length of array
        System.out.print("Enter the length of the array: ");
        Scanner input = new Scanner(System.in);
        int arrayLength = input.nextInt();

        // Initialize array
        double[] list = new double[arrayLength];

        // Prompt user for elements of the array
        System.out.print("Enter the elements in the array: ");
        for (int i = 0; i < arrayLength; i++) {
            list[i] = input.nextDouble();
        }

        // goes up to index list.length - 1
        // because you don't need to check last element
        // since it will be sorted already
        for (int i = 0; i < list.length - 1; i++) {
            double min = list[i];
            int minIndex = i;

            // find the current smallest element
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < min) {
                    min = list[j];
                    minIndex = j;
                }
            }

            // swap it with whatever is in the
            // first position of unsorted array if needed
            if (minIndex != i) {
                double temp = list[i];
                list[i] = min;
                list[minIndex] = temp;
            }
        }

        // print the sorted array
        for (double n : list) {
            System.out.print(n + " ");
        }
        System.out.println(); // move cursor to next line

        input.close();
    }
}
