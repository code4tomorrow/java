package com.codefortomorrow.intermediate.chapter10.solutions;

/*
Random Numbers

Fill a 4 x 6 integer array with 24 random values from 7 to 77.
Use the randInt(min, max) method that is given to you to do this.
To call the method, type randInt(7, 77) and assign it to
an array element. For example: list[0][0] = randInt(7, 77);

Print the values in 4 rows of 6 elements.
Keep track of the sum of all the values in the array.
Display the sum on its own line under the array values.
Keep track of the maximum and minimum value in the array.
Display the max and min below the sum.

Hint: You will need to set the max to Integer.MIN_VALUE
and min to Integer.MAX_VALUE when you first initialize them.
This ensures that when you iterate through the
randomly generated numbers in your array, the max and min
are updated correctly.
(You can also set max to 6 and min to 78.)
*/

public class RandomNumbers {
    public static void main(String[] args) {
        int[][] numbers = new int[4][6]; // create 4x6 array
		int sum = 0; // sum of all elements in array
		int max = Integer.MIN_VALUE; // max element in array
		int min = Integer.MAX_VALUE; // min element in array

		// iterate through each element in a
		for (int row = 0; row < 4; row++) {
			for (int col = 0; col < 6; col++) {
				// generate a random number from 7 to 77
				// and store it in the array
				numbers[row][col] = randInt(7, 77);

				// print that element
				System.out.print(numbers[row][col] + "\t");

				// keep a running total of all elements
				sum += numbers[row][col];

				// update min or max as needed
				if (numbers[row][col] < min) {
					min = numbers[row][col];
				}
					
				if (numbers[row][col] > max) {
					max = numbers[row][col];
				}
			}
			System.out.println(); // move to next row
		}

		// display the sum of all elements
		// and the max and min element
		System.out.println("Sum: " + sum);
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
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