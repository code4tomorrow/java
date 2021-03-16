package com.codefortomorrow.advanced.chapter16.solutions;

// UUID to represent each node's unique ID
import java.util.UUID;

/**
 * @author ArmeetJatyani
 * March 2021
 *
 * Implement a simple LinkedList
 * You will need to create a LinkedListNode class, which represents each item/node in the linked list
 * Assume that the elements in the linked list are all of type int
 * Required functionality...
 * - head(): get head of list
 * - tail(): get tail of list
 * - add(): add to tail of list
 * - push(): push to head of list
 * - pop(): remove head of list
 * - toString(): return a String representation of the list
 */

public class LinkedList {

    private LinkedListNode head;

    /**
     * default constructor
     */
    public LinkedList() {
        head = null;
    }

    /**
     * constructor with first value
     * @param value  first element in the linked list
     */
    public LinkedList(int value) {
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
     * push (add element to head of linkedlist)
     */
    public void push(int value) {
        LinkedListNode newHead = new LinkedListNode(value, head);
        head = newHead;
    }

    /**
     * pop (remove and return head of linkedlist)
     * @return the node that was removed
     */
    public LinkedListNode pop() {
        LinkedListNode popped = head;
        head = head.next();
        return popped;
    }

    /**
     * Returns a String version of the LinkedList
     * @return a String version of the LinkedList
     */
    @Override
    public String toString() {
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

    private UUID ID;
    private int value;

    /**
     * Constructs a list node with the given value
     * @param value  the value stored in this Node
     */
    public Node(int value) {
        this.ID = UUID.randomUUID();
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
