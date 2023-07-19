package org.example.DataStructure.String;

import java.util.HashMap;

public class SumofBeautyofAllSubstrings {
    public static void main(String[] args) {
        System.out.println(beautySum("aabcb"));
    }

    private static int beautySum(String s) {
        int sum = 0;
        for(int i=0;i<s.length();i++){
            int []freq = new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int maximum = Integer.MIN_VALUE;
                int minimum = Integer.MAX_VALUE;
                for( int k = 0 ; k<26;k++){
                    maximum = Math.max(maximum, freq[k]);
                    if(freq[k] != 0){
                        minimum = Math.min(minimum, freq[k]);
                    }
                }
                sum+=maximum-minimum;
            }
        }
        return sum;
    }
}
