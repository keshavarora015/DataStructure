package com.practice.DataStructure.String;

public class LongestPalindromicSubString {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }

    /**
     *  Input = babad
     *
     *  Output = bab
     *
     *
     * */
    public static String longestPalindrome(String s) {
        if(s.length()<=1)
            return s;

        String ans="";

        for(int i=1;i<s.length();i++){

            //odd Palindrome
            int low = i;
            int high = i;

            while (s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            String temp = s.substring(low+1,high);
            if(temp.length() > ans.length()){
                ans = temp;
            }

            //EvenPalindrome

            low = i-1;
            high = i;

            while (s.charAt(low) == s.charAt(high) ){
                low--;
                high++;
                if(low == -1 || high == s.length()){
                    break;
                }
            }

            temp = s.substring(low+1,high);
            if(temp.length() > ans.length()){
                ans = temp;
            }

        }
        return ans;
    }
}
