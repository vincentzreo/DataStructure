package com.zzq.leetcode;

/**
 * 237.删除链表中的节点
 */
public class Solution4 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
