package com.practice.DataStructure.String;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwwkew"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        int start = 0;
        for(int i=0;i<s.length();){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                maxLen = Math.max(maxLen,i-start+1);
                i++;
            } else {
                set.remove(s.charAt(start));
                start++;
            }
        }
        return maxLen;
    }
}
