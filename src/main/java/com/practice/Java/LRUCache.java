package com.practice.Java;

import java.util.*;

public class LRUCache {
    int capacity;
    Set<Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashSet<>(capacity); // order maintain rhye.
    }

    private void insert(int data){
        if(cache.size() == capacity){
            //remove first element i.e. LRU
            cache.remove(cache.iterator().next());
        }
        cache.add(data);
    }

    private void lru(int data){
        if(!isPresentInCache(data)){
            insert(data);
        }
    }

    private boolean isPresentInCache(int data) {
        if(!cache.contains(data)){
            return false;
        }
        cache.remove(data);
        cache.add(data);
        return true;
    }

    private void print() {
//        for (Integer element : cache) {
//            System.out.println(element);
//        }

        List<Integer> list = new ArrayList<>(cache);
        Collections.reverse(list);

        for (Integer element : list) {
            System.out.print(element +" ");
        }
    }


    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(4);
        lruCache.lru(1);
        lruCache.lru(2);
        lruCache.lru(3);
        lruCache.lru(1);
        lruCache.lru(4);
        lruCache.lru(5);
        lruCache.print();
    }
}
