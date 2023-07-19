package org.example.Extra;

import java.util.PriorityQueue;

public class duplicateRemove {

    static String arrange(String str){
        int len = str.length();
        int[] count = new int[26];

        for(int i=0;i<len;i++){
            count[str.charAt(i) - 'a']++;
        }

        PriorityQueue<KeyValue>pq = new PriorityQueue<>(new Compare());
        for(char c = 'a'; c<='z';c++){
            int val = c-'a';
            if(count[val] > 0){
                pq.add(new KeyValue(count[val],c));
            }
        }
        String ans = "";
        KeyValue lastvalue = new KeyValue(-1,'*');
        while (pq.size() != 0){
            KeyValue k = pq.peek();
            pq.poll();
            ans=ans + k.ch;
            if(lastvalue.freq > 0){
                pq.add(lastvalue);
            }
            k.freq--;
            lastvalue = k;
        }
        System.out.println(ans);
        if(len != ans.length()){
            return "Not Possible";
        }
        return ans;
    }
    public static void main(String[] args) {
     String str = "bbcccc";
        System.out.println(arrange(str));
    }
}

