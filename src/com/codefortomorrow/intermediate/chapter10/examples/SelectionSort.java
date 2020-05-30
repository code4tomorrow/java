package com.codefortomorrow.intermediate.chapter10.examples;

public class SelectionSort {
	public static void main(String[] args) {
		int[] list = {5, 25, -1, 2, 9, 5, -4};

		// goes up to index list.length - 1
		// because you don't need to check last element
		// since it will be sorted already
		for (int i = 0; i < list.length - 1; i++) {
			int min = list[i];
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
				int temp = list[i];
				list[i] = min;
				list[minIndex] = temp;
			}
		}

		// print the sorted array
		for (int n: list) {
			System.out.print(n + " ");
		}
		System.out.println(); // move cursor to next line
	}
}
