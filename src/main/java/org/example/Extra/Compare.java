package org.example.Extra;

import java.util.Comparator;

class Compare implements Comparator<KeyValue> {

    @Override
    public int compare(KeyValue o1, KeyValue o2) {
        if(o1.freq < o2.freq)
            return 1;
        else if(o1.freq > o2.freq)
            return -1;
        return 0;
    }
}