package com.codefortomorrow.advanced.chapter17.practice;

/*
Create a Queue using one Stack "under the hood"
Try implementing MakeQueueWithTwoStacks first.
If you are stuck try thinking of a technique from Ch. 13 that creates a call "stack"

Problem adapted from leetcode.com
*/

import java.util.NoSuchElementException;

class MyQueueV2<E> {

    public MyQueueV2() {}

    public void add(E e) {}

    public E remove() throws NoSuchElementException {
        return null;
    }

    public boolean empty() {
        return true;
    }
}

public class MakeQueueWithOneStack {

    public static void main(String[] args) {
        MyQueueV2<Integer> myQueue = new MyQueueV2<>();
    }
}
