package com.zzq.stock;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225 . 用队列实现栈
 */
public class MyStack {
    Queue<Integer> queue;
    private int x;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> queue1 = new LinkedList<>();
        while (!queue.isEmpty()){
            x = queue.poll();
            if (!queue.isEmpty()){
                queue1.add(x);
            }

        }
        while (!queue1.isEmpty())
            queue.add(queue1.poll());
        return x;
    }

    /** Get the top element. */
    public int top() {
        Queue<Integer> queue1 = new LinkedList<>();
        while (!queue.isEmpty()){
            x = queue.poll();

            queue1.add(x);


        }
        while (!queue1.isEmpty())
            queue.add(queue1.poll());
        return x;

    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
