package com.practice.DataStructure.String;

import java.util.Stack;

public class MaxDepth {
    public static void main(String[] args) {
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
    }

    private static int maxDepth(String s) {
        int maxCount = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                count++;
            } else if(s.charAt(i) == ')'){
                if(count >maxCount)
                    maxCount = count;
                count--;
            }
        }
        return maxCount;
    }
}
