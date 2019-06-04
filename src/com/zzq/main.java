package com.zzq;

import com.zzq.LinkedList.LinkedList;
import com.zzq.queue.ArrayQueue;
import com.zzq.queue.LoopQueue;
import com.zzq.queue.Queue;
import com.zzq.stock.ArrayStack;
import com.zzq.stock.LinkedListStack;
import com.zzq.stock.Stack;

import java.util.Random;

public class main {
    //测试使用q运行opCount个enqueue和dequeue操作使用的时间
    private static double testQueue(Queue<Integer> q,int opCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0 ; i < opCount ; i ++){
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < opCount ; i++) {
            q.dequeue();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
    //比较arraystack与linkedlistStack的性能
    private static double testStack(Stack<Integer> stack,int optCount){
        long startTime = System.nanoTime();
        Random random = new Random();
        for (int i = 0; i < optCount ; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }
        for (int i = 0; i < optCount ; i++) {
            stack.pop();
        }
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
    public static void main(String[] args) {

      /*  int opCount = 100000;
        ArrayQueue<Integer> arrayQueue = new ArrayQueue<>();
        double time1 = testQueue(arrayQueue,opCount);
        System.out.println("ArrayQueue, time: " + time1 + " s");
        LoopQueue<Integer> loopQueue = new LoopQueue<>();
        double time2 = testQueue(loopQueue,opCount);
        System.out.println("LoopQueue, time: " + time2 + " s");*/
       /* LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 5 ; i++) {
            linkedList.addFirst(i);
            System.out.println(linkedList);
        }
        linkedList.add(2,666);
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.removeLast();
        System.out.println(linkedList);*/
       /* LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 5 ; i++) {
            stack.push(i);
            System.out.println(stack);
            
        }
        stack.pop();
        System.out.println(stack);
*/
        int optCount = 100000;
        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack,optCount);
        System.out.println("ArrayStack,time: " + time1 + "s");
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack,optCount);
        System.out.println("LinkListStack,time: "+time2+"s");
        //LinkListStack包含更多的new操作
    }
}
