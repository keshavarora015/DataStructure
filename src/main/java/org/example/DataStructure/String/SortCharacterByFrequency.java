package org.example.DataStructure.String;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }

     static String frequencySort(String s) {
        HashMap <Character,Integer> freqMap = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if(freqMap.containsKey(s.charAt(i))){
                int freq = freqMap.get(s.charAt(i));
                freqMap.put(s.charAt(i),freq+1);
            } else {
                freqMap.put(s.charAt(i),1);
            }
        }

        PriorityQueue<KeyValue>pq = new PriorityQueue<>(new Comp());
         for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
             Character value = entry.getKey();
             int key = entry.getValue();
             pq.add(new KeyValue(key,value));
         }
         String ans ="";
         while (pq.size() != 0){
             KeyValue k = pq.peek();
             pq.poll();
             while(k.freq>0){
                 ans+=k.ch;
                 k.freq--;
             }
         }
        return ans;
    }

    public static class KeyValue {
        int freq;
        char ch;
        KeyValue(int val, char c){
            freq = val;
            ch=c;
        }
    }
}
