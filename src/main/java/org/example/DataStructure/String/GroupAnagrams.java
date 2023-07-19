package org.example.DataStructure.String;

import org.example.Print;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = new String[]{"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ans = groupAnagrams(strs);
        Print print = new Print();
        print.print2DList(ans);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();

        if(strs.length == 0 || strs == null)
            return ans;

        Map<String,List<String>> freq = new HashMap<>();

        for(int i=0;i < strs.length ; i++){
            String key = generateFreqKey(strs[i]);
            if(freq.containsKey(key)){
                freq.get(key).add(strs[i]);
            } else {
                List <String> temp = new ArrayList<>();
                temp.add(strs[i]);
                freq.put(key,temp);
            }
        }
        for(Map.Entry<String,List<String>> m : freq.entrySet()){
            ans.add(m.getValue());
        }
        return ans;
    }

    private static String generateFreqKey(String str) {
        int[] freq = new int[26];

        for(int i=0;i<str.length();i++){
            freq[str.charAt(i)-'a']++;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        char c = 'a';

        for(int count : freq){
            stringBuilder.append(c);
            stringBuilder.append(count);
            c++;
        }

        return stringBuilder.toString();
    }
}
