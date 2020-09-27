package com.codefortomorrow.advanced.chapter14.solutions;

/*
Create a class called BankAccount (a separate
class from your main program) that contains a
private “balance” attribute for the amount of
money in the account.

The user should be able to set the original
balance upon initialization (through the constructor).
The class should have deposit and withdraw methods
that add and subtract money from the account.
There should also be a getter method to access
the balance, since the attribute is private.

Create at least 2 instances of BankAccount.
Deposit, withdraw, and display the final balance of each.

Create a NotEnoughMoneyException class that is a
checked exception. The withdraw method should throw
this exception if the user tries to withdraw an
amount that is greater than their current balance.
Handle this exception by displaying the difference
between the balance and the amount to be withdrawn,
and do this exception handling in the main program
where you have created instances of BankAccount.
*/

public class Bank {
    
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(500);
        BankAccount account2 = new BankAccount(1000);

        account1.deposit(200);
        withdraw(account1, 300);
        System.out.println("Account 1: " + account1.getBalance());

        account2.deposit(200);
        withdraw(account2, 1500);
        System.out.println("Account 2: " + account2.getBalance());
    }

    public static void withdraw(BankAccount account, int amount) {
        try {
            account.withdraw(amount);
        } catch (NotEnoughMoneyException e) {
            int diff = Math.abs(amount - account.getBalance());
            System.out.println(e.toString());
        }
    }
}


class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) throws NotEnoughMoneyException {
        if(amount > balance)
            throw new NotEnoughMoneyException(
                "Bank balance is short $" + Math.abs(balance - amount));
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}


class NotEnoughMoneyException extends Exception {

    public NotEnoughMoneyException() {}

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
