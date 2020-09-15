package com.codefortomorrow.beginner.chapter7.solutions;

/*
 * Create a program called Calculator which has
 * the same functionality as the one in the switch
 * example, except with more features!
 *
 * Here's where we're going to make use of the
 * modulus operator which gives the remainder of
 * a division problem. Add the % operator as one
 * possible option for the user to choose and utilize.
 *
 * You should also change the operator choices.
 * For example, instead of prompting the user for
 * "add" or "subtract", prompt them for the characters
 * '+' and '-'. Note: You can assume that the operator
 * given by the user is the first character in the line,
 * since there is no nextChar() method for Scanner.
 */

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Operators: + - * / %");

        // prompt user for an operator
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an operator above: ");
        // assume operator is first character in the line
        char operator = input.nextLine().charAt(0);
        input.close();

        boolean isOperatorValid =
            operator == '+' ||
            operator == '-' ||
            operator == '*' ||
            operator == '/' ||
            operator == '%';

        // do the calculation if the operator is valid
        if (isOperatorValid) {
            System.out.print("Enter operand 1: ");
            double operand1 = input.nextDouble();

            System.out.print("Enter operand 2: ");
            double operand2 = input.nextDouble();

            double result = 0; // placeholder
            switch (operator) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
                case '%':
                    result = operand1 % operand2;
                    break;
            }
            System.out.println(
                operand1 + " " + operator + " " + operand2 + " = " + result
            );
        } else {
            // print an error message if the operator is invalid
            System.out.println("Sorry, that is not a valid operator.");
        }
    }
}
