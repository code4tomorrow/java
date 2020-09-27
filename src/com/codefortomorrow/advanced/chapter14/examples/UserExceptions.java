package com.codefortomorrow.advanced.chapter14.examples;

public class UserExceptions {

    public static void main(String[] args) {
        try {
            call(null);
        } catch (MyException e) {
            System.out.println("Caught MyException");
        }

        throw new ArithmeticException("divide by zero error");
    }

    public static void call(String s) throws MyException {
        if (s == null) throw new MyException();
    }
}
