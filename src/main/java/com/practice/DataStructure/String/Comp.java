package com.practice.DataStructure.String;

import java.util.Comparator;
    class Comp implements Comparator<SortCharacterByFrequency.KeyValue> {

        @Override
        public int compare(SortCharacterByFrequency.KeyValue o1, SortCharacterByFrequency.KeyValue o2) {
            if(o1.freq < o2.freq)
                return 1;
            else if(o1.freq > o2.freq)
                return -1;
            return 0;
        }
    }