package com.zzq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的中序遍历
 */
public class Solution94 {
      private class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorderTraversal(root,list);
        return list;
    }

    private void inorderTraversal(TreeNode node, List<Integer> list) {
          if (node == null)
              return;
          inorderTraversal(node.left,list);
          list.add(node.val);
          inorderTraversal(node.right,list);
    }
}
