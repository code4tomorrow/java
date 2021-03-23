package com.codefortomorrow.beginner.chapter4.solutions;

/**
 * @author ArmeetJatyani
 * March 2021
 * 
 * Manage a car dealership and take inventory of all cars sold!
 */

 public class CarDealership {
    public static void main(String[] args) {
        // write your code here
        
        // define 3 integer constants, representing the prices of 3 cars sold in USD (line 15-17)
        final int car1 = 30000;
        final int car2 = 24650;
        final int car3 = 253630;

        // define an integer variable, which represents the sum of the prices of these 3 cars (line 20)
        int revenue = car1 + car2 + car3;
        
        // print out the formatted revenue after selling these 3 cars, output: "I sold 3 cars for $XXXXXX." (line 23)
        System.out.println("I sold 3 cars for $" + revenue + ".");


    }
 }
   