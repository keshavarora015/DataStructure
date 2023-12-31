package com.practice.DataStructure.String;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInteger("MCMXCIV"));
    }

    private static int romanToInteger(String s) {
        int ans =0;
        for(int i=0;i<s.length();i++){
            if( i+1 < s.length() && getValue(s.charAt(i)) < getValue(s.charAt(i+1))){
                ans = ans + (getValue(s.charAt(i+1)) - getValue(s.charAt(i)));
                i++;
            } else
                ans += getValue(s.charAt(i));
        }
        return ans;
    }

    private static int getValue(Character c){
        switch(c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;
        }
    }
}
