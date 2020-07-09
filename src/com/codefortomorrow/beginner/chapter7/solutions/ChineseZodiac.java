package com.codefortomorrow.beginner.chapter7.solutions;

/*
 * Adapted from Listing 3.9 from
 * Introduction to Java Programming (Comprehensive),
 * 10th ed. by Y. Daniel Liang
 *
 * Prompt the user for their birth year.
 * Using a switch, print their zodiac sign.
 *
 * Hint: Zodiac signs repeat every 12 years.
 * Order of zodiac signs: monkey, rooster, dog,
 * pig, rat, ox, tiger, rabbit, dragon, snake,
 * horse, sheep
 */

import java.util.Scanner;

public class ChineseZodiac {

    public static void main(String[] args) {
        // prompt user for their birth year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        int year = input.nextInt();
        input.close();

        // print the month that corresponds with that number
        switch (year % 12) {
            case 0:
                System.out.println("monkey");
                break;
            case 1:
                System.out.println("rooster");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
        }
    }
}
