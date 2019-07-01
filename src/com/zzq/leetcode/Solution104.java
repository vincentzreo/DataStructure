package com.zzq.leetcode;

public class Solution104 {

      private class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int x) {
              val = x;
          }
      }

    public int maxDepth(TreeNode root) {
     if (root == null){
            return 0;
        }else {
            int max_left = maxDepth(root.left);
            int max_right = maxDepth(root.right);
            return Math.max(max_left,max_right) + 1;
        }


    }
}
