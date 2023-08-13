package com.practice.DataStructure.String;

import java.util.Arrays;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("aad","egg"));
    }
    public static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] map1 = new int[256];
        Arrays.fill(map1, 0);
        int[] map2 = new int[256];
        Arrays.fill(map2, 0);

        for(int i=0; i<s.length(); i++) {
            //appeared first time in string then map it.
            if(map1[s.charAt(i)] == 0 && map2[t.charAt(i)] == 0) {
                map1[s.charAt(i)] = t.charAt(i);
                map2[t.charAt(i)] = s.charAt(i);
            } else if(map1[s.charAt(i)] != t.charAt(i)) {
                 return false;
            }
        }
        return true;
    }
}
