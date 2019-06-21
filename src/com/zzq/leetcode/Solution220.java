package com.zzq.leetcode;

public class Solution220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j <= i+k&&j < nums.length ; j++) {
                if (Math.abs((long)nums[i]-(long)nums[j])  <= t){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {-1,2147483647};
        int k = 1;
        int t = 2147483647;
        System.out.println(nums[1] - nums[0]);
    }
}
