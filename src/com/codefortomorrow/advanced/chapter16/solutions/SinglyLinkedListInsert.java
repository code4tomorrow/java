package com.codefortomorrow.advanced.chapter16.solutions;

import java.util.*;

/*
Adding an insert method to a SinglyLinkedList
(details in SinglyLinkedList DIY section). 

Hint: It might be necessary to have a separate case for
inserting at position 0, because that’s when you want to
insert BEFORE the head. For all other positions (1, 2, etc.),
you can simply traverse down the list, keeping track of the
current node, and when you reach the position you want,
add the node AFTER the current node.

Alternatively, you can always add BEFORE the current node
for all position cases (insert before the head to place the
new node at pos 0, insert before node 1 to place the new
node at pos 1, etc.), but then your exception case would
be when the user wants to insert a node at the very end of the list.
In this case, you’d have to write separate code to insert AFTER
the last node.

Make sure you have a toString() method defined!

The following code should output “{2, 3, 4, 7}”:
SinglyLinkedList lst = new SinglyLinkedList();
lst.add(3);
lst.add(7);
lst.insert(4, 1);
lst.insert(2, 0);
System.out.println(lst);
*/

// NOTE: You need to make a separate class with a main()
// method to use this List object. This is simply the object
// definition.

public class SinglyLinkedListInsert {

    Node head;

    // add() method from SinglyLinkedList DIY section, adds to end of list
    public void add(int data) {
        // Create a new node with given data
        Node new_node = new Node(data);

        // If the Linked List is empty,
        // then make the new node as head
        if (head == null) {
            head = new_node;
        } else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }
    }

    public void insert(int data, int pos) {
        // Verify valid pos number
        if (pos < 0) System.out.print("Invalid position");

        // Create new node and keep track of current node
        Node new_node = new Node(data);
        Node current = head;

        // If pos is 0, set new node as head
        if (pos == 0) {
            new_node.next = head;
            head = new_node;
        } else {
            while (pos-- >= 0) {
                if (pos == 0) {
                    // Add new node after current position
                    new_node.next = current.next;
                    current.next = new_node;
                    break;
                }
                // Check if pos is out of bounds (reaches end)
                if (current.next == null) {
                    System.out.println("Out of bounds");
                    break;
                }
                current = current.next;
            }
        }
    }

    @Override
    public String toString() {
        // For empty lists
        if (head == null) return "{}";

        String str = "{";

        // Traverse the list until the last node
        Node current = head;
        while (current.next != null) {
            str += "" + current.data + ", ";
            current = current.next;
        }
        str += current.data + "}";
        return str;
    }
}
