package com.codefortomorrow.beginner.chapter7.examples;

public class FallThrough {
	public static void main(String[] args) {
		int n = 3;

		switch (n) {
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
			case 3:
				System.out.println(3);
			case 4:
				System.out.println(4);
			case 5:
				System.out.println(5);
				break;
			case 6:
				System.out.println(6);
		}

		// example of when fall-through is good: phone words
		char ch = 'a';
		int number = 0;

		switch (ch) {
			case 'a':
			case 'b':
			case 'c':
				number = 2;
				break;
			case 'd':
			case 'e':
			case 'f':
				number = 3;
				break;
			case 'g':
			case 'h':
			case 'i':
				number = 4;
				break;
			case 'j':
			case 'k':
			case 'l':
				number = 5;
				break;
			case 'm':
			case 'n':
			case 'o':
				number = 6;
				break;
			case 'p':
			case 'q':
			case 'r':
			case 's':
				number = 7;
				break;
			case 't':
			case 'u':
			case 'v':
				number = 8;
				break;
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				number = 9;
				break; // technically not needed, but good practice in case you add more cases later
		}
		System.out.println("Number: " + number);
	}
}
