package com.codefortomorrow.advanced.chapter17.solutions;

import java.util.NoSuchElementException;
import java.util.Stack;

/*
This implementation of MyQueueV2 uses the first stack as LIFO order "storage" space.
In order to get the functionality of another stack, we will use recursion
When the user adds into the MyQueueV2, the operation is instant. When the user removes from the MyQueueV2,
the remove method either throws an exception, or recursively pops from the stack until the first element inserted
is isolated. After the first element is returned, the stack of Es is restored as the recursive call stack shrinks
 */

class MyQueueV2<E> {
    Stack<E> stack;

    public MyQueueV2() {
        stack = new Stack<>();
    }

    public void add(E e) {
        stack.push(e);
    }

    public E remove() throws NoSuchElementException {
        if (empty())
            throw new NoSuchElementException("no element in this queue left to remove");
        return removeHelper();
    }

    private E removeHelper() {
        if (stack.size() == 1)
            return stack.pop();
        E e = stack.pop();
        E val = removeHelper();
        stack.push(e);
        return val;
    }

    public boolean empty() {
        return stack.empty();
    }
}

public class MakeQueueWithOneStack {
    public static void main(String[] args) {
        MyQueueV2<Integer> myQueue = new MyQueueV2<>();
        myQueue.add(1);
        Integer a = myQueue.remove();
        System.out.println(a); // 1
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        a = myQueue.remove();
        System.out.println(a); // 2
        a = myQueue.remove();
        System.out.println(a); // 3
        a = myQueue.remove();
        System.out.println(a); // 4
        try {
            a = myQueue.remove();
        }
        catch (NoSuchElementException e) {
            e.printStackTrace();
        }
        System.out.println("tests complete");
    }
}
