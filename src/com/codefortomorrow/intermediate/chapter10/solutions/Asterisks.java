package com.codefortomorrow.intermediate.chapter10.solutions;

/*
Asterisks

Fill a 3 X 3 string array so that the values
in each row are "*", "**", "***".
Print the values in 3 rows of 3 elements, each separated by a tab.
Fill the array with values using a loop.
Keep track of the total number of asterisks in the array,
and print it below the array values.
*/

public class Asterisks {
    public static void main(String[] args) {
        // create a 3x3 array
		String[][] array = new String[3][3];
		String asterisks = "*";
		int numberOfAsterisks = 0;

		// iterate through the 3x3 array
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				// store the asterisk(s) in the array
				array[row][col] = asterisks;

				// print the current element
				System.out.print(array[row][col] + "\t");

				// update total number of asterisks in array
				numberOfAsterisks += row + 1;
			}
			System.out.println(); // move to next row
			asterisks += "*"; // each row has 1 more asterisk than the last one
		}

		// print the total number of asterisks in the array
		System.out.println("Number of asterisks: " + numberOfAsterisks);
    }
}