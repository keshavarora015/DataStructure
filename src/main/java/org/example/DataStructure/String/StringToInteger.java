package org.example.DataStructure.String;

import java.util.Map;

public class StringToInteger {
    public static void main(String[] args) {
        System.out.println(myAtoi("9223372036854775808"));
    }

    public static int myAtoi(String s) {
        if(s.length() == 0)
            return 0;

        int i =0;
        for (i=0;i<s.length();i++){
            if(s.charAt(i) != ' ')
                break;
        }
        boolean positive = false;
        boolean negative = false;
        if(i < s.length() && s.charAt(i) == '+'){
            positive = true;
            i++;
        }
        if ( i < s.length() && s.charAt(i) == '-') {
            negative = true;
            i++;
        }

        long ans = 0;
        while (i<s.length() && s.charAt(i) >='0' && s.charAt(i) <='9' ){
            ans = ans * 10 + (s.charAt(i) - '0');
            i++;
            if(ans>=Integer.MAX_VALUE)
                break;
        }
        if(negative){
            ans*=-1;
        }
        if(positive && negative)
            return 0;
        if(ans >= Integer.MAX_VALUE )
            ans = Integer.MAX_VALUE;
        if (ans <= Integer.MIN_VALUE) {
            ans = Integer.MIN_VALUE;
        }

        return (int) ans;
    }

}
