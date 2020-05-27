package com.codefortomorrow.intermediate.chapter12.examples;

public class Equals {
	public static void main(String[] args) {
		String word1 = new String("hello");
		String word2 = new String("hello");
		System.out.println(word1 == word2); // false
		System.out.println(word1.equals(word2)); // true
	}
}
