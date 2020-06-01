package com.codefortomorrow.intermediate.chapter10.examples;

public class StringMethods {
	public static void main(String[] args) {
		String[] str = {
				"Tahiti, it's a magical place",
				"May the Force be with you",
				"no mourners no funerals",
				"apples",
				"oranges",
				"APPLES",
				"     lots of whitespace     "
		};

		System.out.println("-------------- Strings --------------");
		for (int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "]: " + str[i]);
		}

		// chatAt()
		// prints each character in str[0]
		System.out.println("-------------- chatAt --------------");
		for (int i = 0; i < str[0].length(); i++) {
			System.out.println(str[0].charAt(i));
		}

		// compareTo()
		// returns a positive number if greater than
		// returns 0 if equal
		// returns a negative number if less than
		System.out.println("-------------- compareTo --------------");
		System.out.println(str[3].compareTo(str[4]));

		// compareToIgnoreCase
		// same as above except case insensitive
		System.out.println("-------------- compareToIgnoreCase --------------");
		System.out.println(str[3].compareToIgnoreCase(str[5]));

		// contains()
		System.out.println("-------------- contains --------------");
		System.out.println(str[2].contains("mourners"));

		// equals()
		System.out.println("-------------- equals --------------");
		System.out.println(str[0].equals(str[1]));

		// equalsIgnoreCase()
		System.out.println("-------------- equalsIgnoreCase --------------");
		System.out.println(str[3].equalsIgnoreCase(str[5]));

		// indexOf()
		System.out.println("-------------- indexOf --------------");
		System.out.println(str[0].indexOf("Tahiti"));
		System.out.println(str[0].indexOf('m'));

		// isEmpty()
		System.out.println("-------------- isEmpty --------------");
		System.out.println(str[1].isEmpty());
		System.out.println("".isEmpty());

		// lastIndexOf()
		System.out.println("-------------- lastIndexOf --------------");
		System.out.println(str[2].lastIndexOf("no"));
		System.out.println(str[2].lastIndexOf('u'));

		// length()
		System.out.println("-------------- length --------------");
		System.out.println(str[3].length());

		// replace()
		System.out.println("-------------- replace --------------");
		System.out.println(str[0].replace('i', '5'));

		// split()
		System.out.println("-------------- split --------------");
		String[] words = str[1].split(" ");
		for (String w: words) {
			System.out.println(w);
		}

		// substring()
		System.out.println("-------------- substring --------------");
		System.out.println(str[3].substring(0, 2));

		// toCharArray()
		System.out.println("-------------- toCharArray --------------");
		char[] characters = str[4].toCharArray();
		for (char c: characters) {
			System.out.println(c);
		}

		// toLowerCase()
		System.out.println("-------------- toLowerCase --------------");
		System.out.println(str[0].toLowerCase());

		// toUpperCase()
		System.out.println("-------------- toUpperCase --------------");
		System.out.println(str[2].toUpperCase());

		// trim()
		System.out.println("-------------- trim --------------");
		System.out.println("Original string: " + str[6]);
		System.out.println("Updated string: " + str[6].trim());

		// immutable
		System.out.println("-------------- Strings are immutable --------------");
		for (int i = 0; i < str.length; i++) {
			System.out.println("str[" + i + "]: " + str[i]);
		}
	}
}
