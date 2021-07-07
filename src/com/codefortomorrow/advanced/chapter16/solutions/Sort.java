package com.codefortomorrow.advanced.chapter16.solutions;

import java.util.Arrays;
import java.util.LinkedList;

/*
Write a method which takes in a LinkedList of Strings
and rearranges the elements (without creating a new list)
so it is sorted in ascending order of String length.
Don’t use any pre-existing sort methods… write your own. :)
*/

public class Sort {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addAll(
            Arrays.asList(
                "Jeannette",
                "Sophia",
                "Computer",
                "Boots",
                "Lava",
                "Lasagna",
                "Dirty",
                "Cleanie"
            )
        );
        sort(list);
        System.out.println(list);
    }

    public static void sort(LinkedList<String> list) {
        if (list.size() < 2) return;
        for (int i = 1; i < list.size(); i++) {
            String current = list.get(i);
            // Check if current word is smaller than previous word
            if (current.length() < list.get(i - 1).length()) {
                // Add current word before the node with
                // same or greater word size
                for (int j = 0; j < i; j++) {
                    if (list.get(j).length() >= current.length()) {
                        list.add(j, current);
                        // Remove duplicate current
                        list.remove(i + 1);
                        break;
                    }
                }
            }
        }
    }
}
