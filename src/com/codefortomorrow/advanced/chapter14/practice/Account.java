package com.codefortomorrow.advanced.chapter14.practice;

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
        // Write your code here
    }

    public static void createAccount(
        String username,
        int age,
        String password,
        String confirmPassword
    ) {
        // Write your code here
    }
}
// Write exception classes here
