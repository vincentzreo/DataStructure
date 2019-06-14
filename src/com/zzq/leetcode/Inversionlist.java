package com.zzq.leetcode;

/**
 * 206 反转一个单链表
 */
public class Inversionlist {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null){
            ListNode curtemp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = curtemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ListNode listNode = new ListNode(nums);
        System.out.println(listNode);
        ListNode listNode1 = (new Inversionlist()).reverseList(listNode);
        System.out.println(listNode1);
    }
}
