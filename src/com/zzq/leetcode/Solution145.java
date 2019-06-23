package com.zzq.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 二叉树的后序遍历
 */
public class Solution145 {


      private class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
         TreeNode(int x) { val = x; }
      }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postorderTraversal(root,list);
        return list;
    }

    private void postorderTraversal(TreeNode node, List<Integer> list) {
          if (node == null)
              return;
          postorderTraversal(node.left,list);
          postorderTraversal(node.right,list);
          list.add(node.val);
    }
}
