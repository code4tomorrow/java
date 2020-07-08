package com.codefortomorrow.intermediate.chapter10.solutions;

/*
Fill a 4 X 6 integer array with 24 random values from 7 to 77.
Print the values in 4 rows of 6 elements.
Using the same array, keep track of the sum of all the values in the array.
Display the sum on its own line under the values.
Keep track of the maximum and minimum value in the array.
Display the max and min on the line below the sum.

Fill a 3 X 3 string array so that the values in each row are “*”, “**”, “***”.
Print the values in 3 rows of 3 elements, each separated by a tab.
Fill the array in a loop, with a separate variable that will
keep track of the number of asterisks in each term.

Fill a 5 X 4 integer array according to the following pattern:

4	9	16	25
8	27	64	125
16	81	256	625
32	243	1024	3125
64	729	4096	15625

Print the values in 5 rows of 4 elements.
Use nested loops to fill the values into the array,
rather than just declaring the values initially.
*hint*: You can set the values of the first row.
(You will then need a loop to print the first row
separately from the rest of the array.)
*/

// TODO explain min and max value

public class RowsCols {
	public static void main(String[] args) {
		int[][] a = new int[4][6]; // create 4x6 array
		int sum = 0; // sum of all elements in array
		int max = Integer.MIN_VALUE; // max element in array
		int min = Integer.MAX_VALUE; // min element in array

		// iterate through each element in a
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 6; col++) {
				// generate a random number from 7 to 77
				// and store it in the array
				a[row][col] = randInt(7, 77);

				// print that element
				System.out.print(a[row][col] + "\t");

				// keep a running total of all elements
				sum += a[row][col];

				// update min or max as needed
				if (a[row][col] < min) {
					min = a[row][col];
				}
					
				if (a[row][col] > max) {
					max = a[row][col];
				}
			}
			System.out.println(); // move to next row
		}

		// display the sum of all elements
		// and the max and min element
		System.out.println("Sum: " + sum);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);

		// add some space between arrays
		System.out.println();
		System.out.println();

		// create a 3x3 array
		String[][] b = new String[3][3]; 
		String asterisks = "*";
		int numberOfAsterisks = 0;

		// iterate through the 3x3 array
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				// store the asterisk(s) in the array
				b[row][col] = asterisks;

				// print the current element
				System.out.print(b[row][col] + "\t");

				// update total number of asterisks in array
				numberOfAsterisks += row + 1;
			}
			System.out.println(); // move to next row
			asterisks += "*"; // each row has 1 more asterisk than the last one
		}

		// print the total number of asterisks in the array
		System.out.println("Number of asterisks: " + numberOfAsterisks);

		// add some space between arrays
		System.out.println();
		System.out.println();

		// create a 5x4 array
		int[][] c = new int[5][4];
 
		for (int power = 2; power < 7; power++) {
			for (int base = 2; base < 6; base++) {
				// assign the correct element based on the pattern
				c[power - 2][base - 2] = (int) (Math.pow(base, power));

				// print the current element
				System.out.print(c[power - 2][base - 2] + "\t");
			}
			System.out.println(); // move to next row
		}
	}

	/**
	 * Returns a random integer
	 * in the range [min, max]
	 * @param min  minimum random integer
	 * @param max  maximum random integer
	 * @return a random integer in the range
	 * [min, max]
	 */
	public static int randInt(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}
}