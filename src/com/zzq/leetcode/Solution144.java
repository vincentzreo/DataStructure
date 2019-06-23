package com.zzq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的前序遍历
 */
public class Solution144 {
      private class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversal(root,list);
        return list;
    }

    private void preorderTraversal(TreeNode node, List<Integer> list) {
          if (node == null)
              return;
          list.add(node.val);
          preorderTraversal(node.left,list);
          preorderTraversal(node.right,list);
    }
}
