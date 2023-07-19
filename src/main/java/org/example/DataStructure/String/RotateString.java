package org.example.DataStructure.String;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("aa","a"));
    }
    public static boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;

        String ans = s+s;
        return ans.contains(goal) ? true : false;
    }
}
