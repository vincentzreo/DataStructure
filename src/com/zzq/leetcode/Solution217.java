package com.zzq.leetcode;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 217.是否存在相同的元素
 */
public class Solution217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            set.add(nums[i]);
        }
        if (set.size() == nums.length)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            int x = iterator.next();
            System.out.println(x);
        }
    }
}
