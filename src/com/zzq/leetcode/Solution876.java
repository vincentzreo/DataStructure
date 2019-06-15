package com.zzq.leetcode;

/**
 * 876.链表的中间节点
 */
public class Solution876 {
    public ListNode middleNode(ListNode head) {
        if (head.next == null)
            return head;
        int i = 1;
        ListNode res = head;
        while (res.next != null){
            i ++;
            res = res.next;
        }
        int x = i/2+1;
        res = head;
        for (int j = 1 ; j < x ; j ++)
            res = res.next;
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,5,2,3,1};
        ListNode listNode = new ListNode(nums);
        (new Solution876()).middleNode(listNode);
    }
}
