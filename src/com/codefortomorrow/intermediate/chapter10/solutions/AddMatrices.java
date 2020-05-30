package com.codefortomorrow.intermediate.chapter10.solutions;

/*
 * Adapted from Exercise 8.5,
 * Introduction to Java Programming (Comprehensive)
 * by Y. Daniel Liang, 10th ed.
 *
 * Create a program called AddMatrices which
 * adds two 3x3 matrices and prints the result.
 * The program should prompt the user to enter
 * data for 2 matrices and then displays those
 * 2 matrices and the sum matrix.
 *
 * Example output:
 *
 * Enter matrix1: 1 2 3 4 5 6 7 8 9
 * Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 * The matrices are added as follows
 * 1.0 2.0 3.0     0.0 2.0 4.0     1.0 4.0 7.0
 * 4.0 5.0 6.0  +  1.0 4.5 2.2  =  5.0 9.5 8.2
 * 7.0 8.0 9.0     1.1 4.3 5.2     8.1 12.3 14.2
 *
 * Hint: You may need to use the Double.parseDouble("a string")
 * to convert the user input to doubles.
 */

import java.util.Scanner;

public class AddMatrices {
	public static void main(String[] args) {
		// create 3 matrices
		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];
		double[][] result = new double[3][3];

		// prompt user to enter data for matrices 1 and 2
		Scanner input = new Scanner(System.in);
		System.out.print("Enter matrix1: ");
		String[] rawMatrix1 = input.nextLine().split(" ");
		System.out.print("Enter matrix2: ");
		String[] rawMatrix2 = input.nextLine().split(" ");

		// convert the raw input to 2D double arrays to represent
		// matrix 1 and matrix 2
		int i = 0; // index of the raw matrix arrays
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				matrix1[row][col] = Double.parseDouble(rawMatrix1[i]);
				matrix2[row][col] = Double.parseDouble(rawMatrix2[i]);
				i++;
			}
		}

		// add the matrices
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				result[row][col] = matrix1[row][col] + matrix2[row][col];
			}
		}

		// print the result
		System.out.println("The matrices are added as follows");

		double[][][] matrices = {matrix1, matrix2, result};

		// print values for each row of each matrix
		for (int row = 0; row < 3; row++) {
			for (double[][] matrix: matrices) {
				for (int col = 0; col < 3; col++) {
					System.out.print(matrix[row][col] + " ");
				}

				// print a +, =, or whitespace depending on
				// the current matrix and row
				if (row == 1) {
					if (matrix == matrix1) {
						System.out.print(" +  ");
					} else if (matrix == matrix2) {
						System.out.print(" =  ");
					}
				} else {
					System.out.print("    ");
				}
			}
			System.out.println(); // new line for each row
		}
	}
}
