package com.codefortomorrow.beginner.chapter7.examples;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        System.out.println("add | subtract | multiply | divide");

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an operation above: ");
        String operation = input.nextLine().toLowerCase(); // case insensitive
        input.close();

        boolean isOperationValid =
            operation.equals("add") ||
            operation.equals("subtract") ||
            operation.equals("multiply") ||
            operation.equals("divide");

        if (isOperationValid) {
            System.out.print("Enter operand 1: ");
            double operand1 = input.nextDouble();

            System.out.print("Enter operand 2: ");
            double operand2 = input.nextDouble();

            double result = 0; // placeholder
            char operator = ' '; // placeholder
            switch (operation) {
                case "add":
                    result = operand1 + operand2;
                    operator = '+';
                    break;
                case "subtract":
                    result = operand1 - operand2;
                    operator = '-';
                    break;
                case "multiply":
                    result = operand1 * operand2;
                    operator = '*';
                    break;
                case "divide":
                    result = operand1 / operand2;
                    operator = '/';
                    break;
            }
            System.out.println(
                operand1 + " " + operator + " " + operand2 + " = " + result
            );
        } else {
            System.out.println("Sorry, that is not a valid operation.");
        }
    }
}
