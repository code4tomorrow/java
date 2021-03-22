package com.codefortomorrow.intermediate.chapter12.practice;

/*
Create a UML diagram for the Account class.
 */

public class Account {

    private String name;
    private long number;
    private double balance;

    public Account() {
        name = "";
        number = 0;
        balance = 0;
    }

    public Account(String name, long number, double balance) {
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
