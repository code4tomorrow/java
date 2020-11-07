package com.codefortomorrow.advanced.chapter16.solutions;
import java.util.*;

/*
Using the methods outlined in the “Benefits of LinkedLists” section,
fill both a LinkedList and an ArrayList with 10,000 elements.
Then, find the time it takes to access the last element of each list.

Determine which type of list can access elements more efficiently.

Hint: You can use the get(int position) method
to access the element at a given position of a list.
*/

public class Access {

    public static void main(String[] args) {
        long a, b;

        // Define lists with 10,000 elements.
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        for(int i = 0; i < 10000; i++)
            list1.add(1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        for(int i = 0; i < 10000; i++)
            list2.add(1);

        // Get time for each operation and output the difference.
        a = System.nanoTime();
        int c = list1.get(9999);
        b = System.nanoTime();
        System.out.println("\nLinked: " + (b-a) + " ns");

        a = System.nanoTime();
        int d = list2.get(9999);
        b = System.nanoTime();
        System.out.println("ArrayList: " + (b-a) + " ns");

        // Note that the ArrayList takes less time.
    }
}
