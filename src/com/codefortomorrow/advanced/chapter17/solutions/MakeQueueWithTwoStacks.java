package com.codefortomorrow.advanced.chapter17.solutions;

import java.util.NoSuchElementException;
import java.util.Stack;

/*
This implementation of MyQueue uses the first stack as LIFO order "storage" space.
The second stack is is always in FIFO order.
When the user adds into the MyQueue, the operation is instant. When the user removes from the MyQueue,
3 things could occur:
1. there is nothing in the MyQueue: return null
2. stack2 is empty, so copy over everything from stack1: return the top of stack2
3. return the top of stack2
 */
class MyQueue<E> {
    Stack<E> stack1;
    Stack<E> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void add(E e) {
        stack1.push(e);
    }

    public E remove() throws NoSuchElementException {
        if (empty())
            throw new NoSuchElementException("no element in this queue left to remove");
        else if (stack2.empty()) {
            while (!stack1.empty())
                stack2.push(stack1.pop());
            return stack2.pop();
        }
        else {
            return stack2.pop();
        }
    }

    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }
}

public class MakeQueueWithTwoStacks {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();
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