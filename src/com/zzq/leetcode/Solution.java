package com.zzq.leetcode;
import com.zzq.stock.ArrayStack;

/**
 * leetcode 题号20 有效的括号
 */
public class Solution {
    public boolean isValid(String s) {
        ArrayStack<Character> stack = new ArrayStack<>();
        for (int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{'){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '('){
                    return false;
                }
                if (c == ']' && topChar != '['){
                    return false;
                }
                if (c == '}' && topChar != '{'){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}

