package com.zzq.LinkedList;

public class LinkedList<E> {
    private class Node{
        public E e;
        public Node next;
        public Node(E e,Node next){
            this.e = e;
            this.next = next;
        }
        public Node(E e){
            this(e,null);
        }
        public Node(){
            this(null,null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    private Node dummyHead;
    private int size;
    public LinkedList(){
        //为链表添加一个虚拟头节点
        dummyHead = new Node(null,null);
        size = 0;
    }
    public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    //在链表头添加元素
    public void addFirst(E e){
      /*  Node node = new Node(e);
        node.next = head;
        head = node;*/
//        head = new Node(e,head);
        add(0,e);
        size ++;
    }
    //在链表索引位置插入新的元素E
    public void add(int index , E e){
        if (index < 0 || index > size){
            throw new IllegalArgumentException("add fail .Liiegal index.");
        }

            Node prev = dummyHead;
            //获取索引的前一个位置
            for (int i = 0; i < index ; i++) {
                prev = prev.next;
            }
          /*  Node node = new Node(e);
            node.next = prev.next;
            prev.next = node;*/
            prev.next = new Node(e,prev.next);
            size ++;

    }
    public void addLast(E e){
        add(size,e);
    }
    //获取链表中的i个元素
    public E get(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("add fail .Liiegal index.");
        }
        Node cur = dummyHead.next;
        //获取索引的当前位置
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }
    public E getFirst(){
        return get(0);
    }
    public E getLast(){
        return get(size-1);
    }
}
