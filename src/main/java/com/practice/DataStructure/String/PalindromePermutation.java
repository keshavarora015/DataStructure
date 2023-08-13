package com.practice.DataStructure.String;

import java.util.Map;

public class PalindromePermutation {
    public static void main(String[] args) {
        System.out.println(palindromeString("aaabbbcc"));
    }

    public static boolean palindromeString(String s) {
        int [] freq = new int[26];

        for(int i=0;i<s.length();i++){
          freq[s.charAt(i)-'a']++;
        }
        boolean oneElementFreqOdd = false;
        for(int i=0;i<freq.length;i++ ){
            if(freq[i]%2 != 0 && !oneElementFreqOdd ){
                oneElementFreqOdd = true;
            } else if (freq[i]%2 != 0 && oneElementFreqOdd ) {
                return false;
            }
        }

       return true;
    }
}