package com.practice.DataStructure.String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
//    public static String longestCommonPrefix(String[] strs) {
//        Arrays.sort(strs);
//        //System.out.println(Arrays.toString(strs));
//        String str1 = strs[0];
//        String str2 = strs[strs.length-1];
//        int index = 0;
//        while (index < str1.length() && index <str2.length()){
//            if(str1.charAt(index) == str2.charAt(index)){
//                index++;
//            } else {
//                break;
//            }
//        }
//        return str1.substring(0,index);
//    }

    public static String longestCommonPrefix(String[] strs) {
           Arrays.sort(strs);
           String a = strs[0];
           String b = strs[strs.length-1];
           int index = 0;
           while (index < a.length() || index < b.length()){
               if(a.charAt(index) != b.charAt(index)){
                   break;
               }
               index++;
           }
           return a.substring(0,index);
    }
}
