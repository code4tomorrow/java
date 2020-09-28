package com.codefortomorrow.advanced.chapter14.practice.account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Account Creation!");
        while (true) {
            System.out.print("Enter username (4 to 10 characters): ");
            String username = sc.next();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            System.out.print("Enter password (4 to 10 characters): ");
            String password = sc.next();
            System.out.print("Confirm password (4 to 10 characters): ");
            String confirmPassword = sc.next();

            // TODO: try and catch to handle exceptions
            createAccount(username, password, age, confirmPassword);
            System.out.println("Account created successfully!");
        }
    }

    public static void createAccount(
        String username,
        String password,
        int age,
        String confirmPassword
    )
        throws InvalidAgeException, InvalidPasswordException, InvalidUsernameException, PasswordMismatchException {
        // TODO: complete
    }
}
