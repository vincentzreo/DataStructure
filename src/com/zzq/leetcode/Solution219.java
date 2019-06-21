package com.zzq.leetcode;

public class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j <= i+k&&j < nums.length ; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,1};
        int k1 = 3;
        int[] nums2 = {1,0,1,1};
        int k2 = 1;
        int[] nums3 = {1,2,3,1,2,3};
        int k3 = 2;
        if ((new Solution219()).containsNearbyDuplicate(nums3,k3))
            System.out.println("存在");
    }
}
