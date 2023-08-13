package com.practice.DataStructure.String;

import com.practice.Print;

public class ResevseString {

    public static void main(String[] args) {
        char s[] = new char[]{'h','e','l','l','o'};
        reverseString(s);
        Print print = new Print();
        print.print(s);
    }
    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;

        while(j>=i){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
