package com.codefortomorrow.advanced.chapter16.solutions;

// UUID to represent each node's unique ID
import java.util.UUID;

/**
 * @author ArmeetJatyani
 * March 2021
 *
 * Implement a simple LinkedList
 * You will need to create a LinkedListNode class, which represents each item/node in the linked list
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
     */
    public LinkedList(int value) {
        // create first node
        head = new LinkedListNode(value, null);
    }

    /**
     * get head of Linked List
     * @return
     */
    public LinkedListNode head() {
        return this.head;
    }

    /**
     * traverse and get tail of linked list
     * @return
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
     * push (add to head of linkedlist)
     * @return
     */
    public void push(int value) {
        LinkedListNode newHead = new LinkedListNode(value, head);
        head = newHead;
    }

    /**
     * pop (remove head of linkedlist)
     * @return
     */
    public LinkedListNode pop() {
        LinkedListNode popped = head;
        head = head.next();
        return popped;
    }

    /**
     * to String
     * @return
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

    public Node(int value) {
        this.ID = UUID.randomUUID();
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}

class LinkedListNode extends Node {

    private LinkedListNode next;

    public LinkedListNode(int value, LinkedListNode next) {
        super(value);
        this.next = next;
    }

    public LinkedListNode next() {
        return this.next;
    }

    public void setNext(LinkedListNode next) {
        this.next = next;
        return;
    }
}
