package com.zzq.leetcode;

import java.util.LinkedList;
import java.util.List;

public class Solution590 {
    private class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
    public List<Integer> postorder(Node root) {
        List<Integer> list = new LinkedList<>();
        postorder(root,list);
        return list;
    }

    private void postorder(Node node, List<Integer> list) {
        if (node == null)
            return;
        List<Node> nodeList = node.children;
        for (int i = 0; i < nodeList.size() ; i++) {
            postorder(nodeList.get(i),list);
        }
        list.add(node.val);
    }
}
