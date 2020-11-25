package com.codefortomorrow.advanced.chapter17.practice;

/*
Create a Queue using one Stack "under the hood"
Try implementing MakeQueueWithTwoStacks first.
If you are stuck try thinking of a technique from Ch. 13 that creates a call "stack"

Problem adapted from leetcode.com
*/

import java.util.NoSuchElementException;

class MyQueue<E> {

    public MyQueue() {}

    public void add(E e) {}

    public E remove() throws NoSuchElementException {
        return null;
    }

    public boolean empty() {
        return true;
    }
}

public class MakeQueueWithTwoStacks {

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
    }
}
