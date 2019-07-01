package com.zzq.leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution429 {
    private class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
  /*  public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node cur = queue.remove();
            List<Integer> list = new LinkedList<>();
            list.add(cur.val);
            while (!cur.children.isEmpty()){

            }
        }
    }*/

}
