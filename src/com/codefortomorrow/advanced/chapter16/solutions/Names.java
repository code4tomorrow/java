package com.codefortomorrow.advanced.chapter16.solutions;

import java.util.LinkedList;
import java.util.Scanner;

/*
Create a LinkedList of Strings, and ask the user to
input 10 names one by one into the list.

Output this list.

Remove each name that has 5 or fewer letters, and output the new list.

Add the word “Apple” to the beginning of the list.

Add the word “Peanut” to the second-to-last position of the list.

(Hint: Make sure to take advantage of LinkedList methods!)

Output the new list.
*/

public class Names {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            list.add(sc.nextLine());
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) if (
            list.get(i).length() <= 5
        ) list.remove(i--);
        System.out.println(list);

        list.add(0, "Apple");
        list.add(list.size() - 1, "Peanut");
        System.out.println(list);

        sc.close();
    }
}
