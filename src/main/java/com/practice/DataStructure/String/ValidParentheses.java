package com.practice.DataStructure.String;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("(])"));
    }
    public static boolean isValid(String s) {
        if(s == "" || s.length() == 0)
            return true;

        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                stack.push(s.charAt(i));
            } else {
                if(stack.isEmpty())
                    return false;

                if(s.charAt(i) == ')' && stack.peek() == '(') {
                    stack.pop();
                }
                else if(s.charAt(i) == ']' && stack.peek() == '[') {
                    stack.pop();
                }
                else if(s.charAt(i) == '}' && stack.peek() == '{') {
                    stack.pop();
                }
                else
                    return false;
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
