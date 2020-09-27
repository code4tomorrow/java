package com.codefortomorrow.advanced.chapter14.solutions.account;

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

            try {
                createAccount(username, password, age, confirmPassword);
                System.out.println("Account created successfully!");
                break;
            } catch (InvalidUsernameException e) {
                System.out.println("Invalid username.");
            } catch (InvalidPasswordException e) {
                System.out.println("Invalid password.");
            } catch (InvalidAgeException e) {
                System.out.println("Must be 18 or older to create an account.");
            } catch (PasswordMismatchException e) {
                System.out.println("Passwords don't match!");
            }
        }
    }

    public static void createAccount(
        String username,
        String password,
        int age,
        String confirmPassword
    )
        throws InvalidAgeException, InvalidPasswordException, InvalidUsernameException, PasswordMismatchException {
        if (username.length() < 4 || username.length() > 10) {
            throw new InvalidUsernameException();
        }
        if (password.length() < 4 || password.length() > 10) {
            throw new InvalidPasswordException();
        }
        if (age < 18) {
            throw new InvalidAgeException();
        }
        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException();
        }
    }
}
