package com.company.exercise;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheImplementation extends LinkedHashMap<Integer,String> {
    private int capacity;

    public LRUCacheImplementation(int capacity,float loadFactor){
        super(capacity,loadFactor,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
        return size()> this.capacity;
    }

    public static void main(String[] args) {
        LRUCacheImplementation lruCacheImplementation = new LRUCacheImplementation(5,0.75f);
        lruCacheImplementation.put(1,"One");
        lruCacheImplementation.put(2,"Two");
        lruCacheImplementation.put(3,"Three");
        lruCacheImplementation.put(4,"Three");
        lruCacheImplementation.put(5,"Three");
        lruCacheImplementation.get(2);
        lruCacheImplementation.get(3);
        lruCacheImplementation.get(2);
    }
}
