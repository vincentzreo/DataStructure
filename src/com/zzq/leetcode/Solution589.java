package com.zzq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * N叉树的前序遍历
 */
public class Solution589 {
    private class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        preorder(root,list);
        return list;

    }

    private void preorder(Node node, List<Integer> list) {
        if (node == null)
            return;
        list.add(node.val);
        List<Node> nodeList = node.children;
        for (int i = 0; i < nodeList.size() ; i++) {
            preorder(nodeList.get(i),list);
        }
    }
}
