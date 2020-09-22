package com.codefortomorrow.advanced.chapter13.practice;

/*
Implement the iterative code as a recursive
function to clarify what the algorithm does.
*/

public class NegativeSum {

    public static void main(String[] args) {
        System.out.println("Iterative:");
        int a = 50, b = 40;
        while(a + b > 0) {
            if(Math.pow(a, 2) + Math.pow(b, 2) > 10000) {
               a *= 8; 
               b *= -4;
            }
            else {
               a *= 3;
               b /= 2;
            }
        }
        System.out.println("a + b: " + (a + b));

        System.out.println("Recursive:");
        System.out.println(negSum(50, 40));
    }

    public static int negSum(int a, int b) {
        if(a + b <= 0)
            return a + b;
        if(Math.pow(a, 2) + Math.pow(b, 2) > 10000)
            return negSum(a * 8, b * -4);
        else
            return negSum(a * 3, b / 2);
    }
}
