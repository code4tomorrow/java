package com.codefortomorrow.advanced.chapter14.solutions;

import java.util.Scanner;

/*
Create the following classes that simply extend the `Exception` class:

- `InvalidUsernameException`
- `InvalidPasswordException`
- `InvalidAgeException`
- `PasswordMismatchException`

In the `Account` class, code a method called `createAccount` that takes a `username`, `age`,
`password`, and `confirmPassword` as parameters.

In `createAccount`, throw an:

- `InvalidUsernameException` - if the given username is <4 or >10 characters.
- `InvalidPasswordException` - if the given password is <4 or >10 characters.
- `InvalidAgeException` - if the given age is <18.
- `PasswordMismatchException` - if the given password does not match the given confirm password.

In your `main` method (within the `Account` class):

- To simulate the creation of an account online, prompt the user to enter their username, age,
  password, and their password again (to confirm).
- Call the `createAccount` method continuously with the user's input and use `try`/`catch` to
  handle the possible exceptions and print the appropriate error message. (You can assume that
  the user input will only throw at most 1 exception.)
- Keep asking the user for input until the account is created successfully.

Example output:

```
Welcome to Account Creation!
Enter username (4 to 10 characters): hi
Enter age: 18
Enter password (4 to 10 characters): thisislong
Confirm password (4 to 10 characters): thisislong
Invalid username.
Enter username (4 to 10 characters): four
Enter age: 18
Enter password (4 to 10 characters): thisislong
Confirm password (4 to 10 characters): thisislong
Account created successfully!
```
*/

public class Account {

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
              createAccount(username, age, password, confirmPassword);
              System.out.println("Account created successfully!");
              sc.close();
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

    public static void createAccount(String username, int age, String password, String confirmPassword)
      throws InvalidAgeException, InvalidPasswordException, InvalidUsernameException, PasswordMismatchException {
        if (username.length() < 4 || username.length() > 10) {
            throw new InvalidUsernameException();
        }

        if (age < 18) {
            throw new InvalidAgeException();
        }

        if (password.length() < 4 || password.length() > 10) {
            throw new InvalidPasswordException();
        }

        if (!password.equals(confirmPassword)) {
            throw new PasswordMismatchException();
        }
      }
}

class InvalidUsernameException extends Exception {}

class InvalidPasswordException extends Exception {}

class InvalidAgeException extends Exception {}

class PasswordMismatchException extends Exception {}
