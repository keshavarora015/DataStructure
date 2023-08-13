package com.practice.DataStructure.String;

import java.util.Stack;

public class RemoveOuterMostParenthesis {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())"));
    }
    public static String removeOuterParentheses(String s) {
        String ans="";
        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                st.pop();
                if(!st.isEmpty()){
                    ans+=s.charAt(i);
                }
            } else {
                if(!st.isEmpty()){
                    ans+=s.charAt(i);
                }
                st.push(s.charAt(i));
            }
        }
        return ans;
    }
}
