package com.codefortomorrow.beginner.chapter8.examples;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        input.close();

        // prints num, num - 1, num - 2, ... , 1
        for (int i = 0; i < num; i++) {
            System.out.println(num - i);
        }
        System.out.println();

        // alternate to the for loop above
        for (int i = num; i > 0; i--) {
            System.out.println(i);
        }
    }
}
