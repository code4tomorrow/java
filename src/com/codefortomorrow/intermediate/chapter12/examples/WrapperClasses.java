package com.codefortomorrow.intermediate.chapter12.examples;

public class WrapperClasses {
	public static void main(String[] args) {
		// auto-boxing (int to Integer)
		Integer intObject = 2;
		// the above is equivalent to:
		// Integer intObject = new Integer(2);

		// auto-unboxing (Integer to int)
		int x = intObject;
	}
}
