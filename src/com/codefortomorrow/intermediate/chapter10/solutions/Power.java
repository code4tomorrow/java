package com.codefortomorrow.intermediate.chapter10.solutions;

/*
Power

Fill a 5 x 4 integer array according to
the following pattern:

4	9   16    25
8	27	64	  125
16	81	256	  625
32	243	1024  3125
64	729	4096  15625

Print the values in 5 rows of 4 elements.
Use nested loops to fill the values into the array,
rather than just declaring the values initially.
*/

public class Power {
    public static void main(String[] args) {
        // create a 5x4 array
		int[][] array = new int[5][4];
 
		for (int power = 2; power < 7; power++) {
			for (int base = 2; base < 6; base++) {
				// assign the correct element based on the pattern
				array[power - 2][base - 2] = (int) (Math.pow(base, power));

				// print the current element
				System.out.print(array[power - 2][base - 2] + "\t");
			}
			System.out.println(); // move to next row
		}
    }
}