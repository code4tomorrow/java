package com.codefortomorrow.intermediate.chapter11.examples;

public class Parameters {
    public static void main(String[] args) {
        // scoopIceCream with 1 parameter
        scoopIceCream("chocolate");
        scoopIceCream("vanilla");
        scoopIceCream("strawberry");

        // scoopIceCream with multiple parameters
        scoopIceCream("chocolate", true);
        scoopIceCream("vanilla", false);
        scoopIceCream("strawberry", true);
    }

    public static void scoopIceCream(String flavor) {
        System.out.println("Here's a scoop of " + flavor + " ice cream!");
    }

    public static void scoopIceCream(String flavor, boolean wantCone) {
        if (wantCone) {
            System.out.println("Here's a scoop of " + flavor + 
                " ice cream on a cone!");
        } else {
            System.out.println("Here's a scoop of " + flavor + " ice cream!");
        }
    }
}