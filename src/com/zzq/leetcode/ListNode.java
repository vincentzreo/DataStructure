package com.zzq.leetcode;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    //链表节点的构造函数
    //使用arr为参数，创建一个链表，当前的listNode为链表头节点
    public ListNode(int[] arr){
        if (arr == null || arr.length == 0)
            throw new IllegalArgumentException("arr can not be empty.");
        this.val = arr[0];
        ListNode cur = this;
        for (int i = 1; i < arr.length ; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        ListNode cur = this;
        while (cur != null){
            res.append(cur.val + "->");
            cur = cur.next;
        }
        res.append("null");
        return res.toString();
    }
}
