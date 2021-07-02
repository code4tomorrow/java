package com.codefortomorrow.advanced.chapter16.solutions;

/**
 * @author ArmeetJatyani
 * March 2021
 *
 * Implement a simple LinkedList
 * You will need to create a LinkedListNode class, which represents each item/node in the linked list
 * Assume that the elements in the linked list are all of type int
 * Required functionality...
 * - head(): get head node of list
 * - tail(): get tail node of list
 * - add(): add element to the end of the list
 * - insert(): insert an element at a given index position
 * - push(): add element to the beginning of the list
 * - pop(): remove head of list and return the node that was removed
 * - clear(): remove all elements in the list
 * - toString(): return a String representation of the list
 * 
 * Create a driver class called TestLinkedList. In the main method, create an instance
 * of LinkedList and test all of its methods at least once. (Print the list as needed
 * to prove the methods worked.)
 */

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        // test default constructor
        SinglyLinkedList list = new SinglyLinkedList();
        System.out.println("Empty linked list: " + list);

        // test 1 arg constructor
        list = new SinglyLinkedList(10);
        System.out.println("Linked list with 1 element: " + list);

        // test add method
        list.add(5);
        list.add(7);
        list.add(12);
        list.add(2);
        System.out.println("Test add(): " + list);

        // test insert method
        list.insert(13, 0);
        System.out.println("Test insert(): " + list);
        list.insert(1, 6);
        System.out.println("Test insert(): " + list);
        list.insert(4, 3);
        System.out.println("Test insert(): " + list);

        // test head and tail methods
        System.out.println("Head: " + list.head().value());
        System.out.println("Tail: " + list.tail().value());
        
        // test push
        list.push(21);
        System.out.println("Test push(): " + list);

        // test pop
        System.out.println("Popped element: " + list.pop().value());
        System.out.println("Test pop(): " + list);
        
        // test clear
        list.clear();
        System.out.println("Test clear(): " + list);
    }
}

class SinglyLinkedList {

    private LinkedListNode head;

    /**
     * default constructor
     */
    public SinglyLinkedList() {
        head = null;
    }

    /**
     * constructor with first value
     * @param value  first element in the linked list
     */
    public SinglyLinkedList(int value) {
        // create first node
        head = new LinkedListNode(value, null);
    }

    /**
     * get head of Linked List
     * @return first element of the linked list
     */
    public LinkedListNode head() {
        return this.head;
    }

    /**
     * traverse and get tail of linked list
     * @return last element of the linked list
     */
    public LinkedListNode tail() {
        LinkedListNode current = head;
        if (current == null) return null;

        while (current.next() != null) {
            current = current.next();
        }

        return current;
    }

    /**
     * add new element (node) to linked list
     * @param value  element to add to the end of the linked list
     */
    public void add(int value) {
        LinkedListNode tail = tail();
        if (tail == null) {
            head = new LinkedListNode(value, null);
        } else {
            tail.setNext(new LinkedListNode(value, null));
        }
    }

    /**
     * Inserts a value at a given position in the linked list
     * @param value  value to insert
     * @param index  where to insert the value
     */
    public void insert(int value, int index) {
        // Verify valid index number
        if (index < 0) System.out.print("Invalid position");

        // Create new node and keep track of current node
        LinkedListNode new_node = new LinkedListNode(value, null);
        LinkedListNode current = head;

        // If index is 0, set new node as head
        if (index == 0) {
            new_node.setNext(head);
            head = new_node;
        } else {
            while (index-- >= 0) {
                if (index == 0) {
                    // Add new node after current position
                    new_node.setNext(current.next());
                    current.setNext(new_node);
                    break;
                }
                // Check if index is out of bounds (reaches end)
                if (current.next() == null) {
                    System.out.println("Out of bounds");
                    break;
                }
                current = current.next();
            }
        }
    }

    /**
     * Adds element to head of the linked list
     */
    public void push(int value) {
        LinkedListNode newHead = new LinkedListNode(value, head);
        head = newHead;
    }

    /**
     * Removes and returns the head of the linked list
     * @return the node that was removed
     */
    public LinkedListNode pop() {
        LinkedListNode popped = head;
        head = head.next();
        return popped;
    }

    /**
     * Removes all elements in the list
     */
    public void clear() {
        head = null;
    }

    /**
     * Returns a String version of the LinkedList
     * @return a String version of the LinkedList
     */
    @Override
    public String toString() {
        if (head == null) {
            return "[]";
        }

        String list = "[";
        LinkedListNode current = head;
        if (current == null) return null;
        do {
            list += Integer.toString(current.value()) + ", ";
            current = current.next();
        } while (current != null);

        // Remove trailing comma and space after last list element
        list = list.substring(0, list.length() - 2);
        return list + "]";
    }
}

class Node {

    private int value;

    /**
     * Constructs a list node with the given value
     * @param value  the value stored in this Node
     */
    public Node(int value) {
        this.value = value;
    }

    /**
     * Returns the value of this Node
     * @return the value of this Node
     */
    public int value() {
        return this.value;
    }
}

class LinkedListNode extends Node {

    private LinkedListNode next;

    /**
     * Constructs a LinkedListNode
     * @param value  the value stored in this node
     * @param next  the next node
     */
    public LinkedListNode(int value, LinkedListNode next) {
        super(value);
        this.next = next;
    }

    /**
     * Returns the next node
     * @return the next node
     */
    public LinkedListNode next() {
        return this.next;
    }

    /**
     * Sets the next node
     * @param next  the next node
     */
    public void setNext(LinkedListNode next) {
        this.next = next;
        return;
    }
}
