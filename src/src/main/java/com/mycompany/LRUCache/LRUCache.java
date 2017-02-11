package com.mycompany.LRUCache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 *
 * @author abhikbanerjee12
 */
public class LRUCache < K, V > extends LinkedHashMap < K, V > {
 
    private int capacity; // Maximum number of items in the cache.
     
    public LRUCache(int capacity) {
        super(capacity+1, 1.0f, true); // Pass 'true' for accessOrder.
        this.capacity = capacity;
    }
     
    protected boolean removeOldestEntry(Entry entry) {
        return (size() > this.capacity);
    }
    
    public void printCacheValues(HashMap lc){
      Iterator it = (Iterator) lc.keySet();
      while(it.hasNext()){
        Map.Entry rt = (Map.Entry) it.next();
        System.out.println(rt.getKey()+" : "+rt.getValue());
      }
      
    }
    
    public static void main(String args[]){

      LRUCache lc = new LRUCache(3);
      lc.put("1", "abhik");
      lc.put("2", "shekhar");
      lc.printCacheValues(lc);
      System.out.println("Accessing key 1 "+lc.get("1"));
      lc.printCacheValues(lc);
      lc.put("3", "rohit");
      lc.put("4", "sujata");
      lc.printCacheValues(lc);
      System.out.println(lc.get("Accessing key 2 "+"2"));
      lc.printCacheValues(lc);
      lc.put("5", "surbhi");
      lc.printCacheValues(lc);
      
    }
    
}