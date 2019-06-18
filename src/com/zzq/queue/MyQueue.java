package com.zzq.queue;

import java.util.Stack;

/**
 * 232 . 使用栈实现队列
 *
 */
public class MyQueue {

    //设置两个栈
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stack1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stack1.isEmpty())
            throw new IllegalArgumentException("queue is empty");
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res = stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }

    /** Get the front element. */
    public int peek() {
        if (stack1.isEmpty())
            throw new IllegalArgumentException("queue is empty");
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int res = stack2.peek();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return res;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack1.isEmpty();
    }



    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        System.out.println(queue);
    }
}
