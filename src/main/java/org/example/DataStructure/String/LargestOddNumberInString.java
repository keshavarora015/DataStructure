package org.example.DataStructure.String;

public class LargestOddNumberInString {

    public static void main(String[] args) {
        System.out.println(largestOddNumber("3542"));
    }
    public static String largestOddNumber(String num) {
        for (int i= num.length()-1; i>=0 ;i--){
            System.out.println(num.charAt(i));
            if (num.charAt(i)%2!= 0)
                return num.substring(0,i+1);
        }
        return "";
    }
}
