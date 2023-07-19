package org.example.DataStructure.String;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;

        int[] freq = new int[26];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<freq.length;i++){
            if(freq[i] != 0)
                return false;
        }

      return true;
    }
}
