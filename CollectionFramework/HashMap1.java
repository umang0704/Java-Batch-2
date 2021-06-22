package CollectionFramework;

import java.util.*;
/*
n = no. of keys or elements to be inserted
M = size of array of linked list (hash table)
Load factor (alpha) = (n/m) : 0.75
*/
 
public class HashMap1 {
    public static void main(String[] args) {
        //creation
        System.out.println("Creation:");
                
        Map m1 = new HashMap();
        Map m2 = new HashMap(20);
        Map m3 = new HashMap(10,0.5f);
        Map m4 = new HashMap(m1);
        
        System.out.println(m1+" "+m2+" "+m3+" "+m4); 
        
        //Insertion
        System.out.println("\nInsertion:");
        for(int i : new int[]{1,2,3,4,5,6,7,8,9,10})
            m1.put(i,(char)(i+64));
        System.out.println(m1);
        m2.putAll(m1); 
        System.out.println(m2);
        
        m2.putIfAbsent(1, "hello");
        m2.putIfAbsent(11,"hello");
        System.out.println(m2);
        
        m2.put(1,"hello");
        System.out.println(m2);
        
        //replace
        System.out.println("\nReplace:");
        
        m2.replace(1, 22);
        System.out.println(m2);
        
        m2.replace(1, 10 ,"Hi");
        m2.replace(2,'B',"Hi");
        System.out.println(m2);
        
        Hashtable<Integer,Integer> o =new Hashtable<>();
        for(int i : new int[]{1,2,3,4,5,6,7,8,9,10})
            o.put(i,i+64);
        
        System.out.println(o);
        o.replaceAll((k,v)->v+2);
        System.out.println(o);
        
        
        //removal
        System.out.println("\nClear:");
        
        System.out.println(m2);
        m2.clear();
        System.out.println(m2);
        
        System.out.println(o);
        o.remove(2);
        System.out.println(o);
        
        o.remove(1,67);
        o.remove(3,60);
        System.out.println(o);
         
        //traversal
        System.out.println("\nTraversal:");
        Set<Map.Entry<Integer,Integer>> e = o.entrySet();
        for(Map.Entry e1 : e)
            System.out.println(e1.getKey()+"->"+e1.getValue());
          
        Set<Integer> s1 = o.keySet();
        for(Integer i  : s1)
            System.out.println(i);
        
        Collection c = o.values();
        for(Object o1 : c)
            System.out.println(o1);
        
        //searching
        System.out.println("\nSearching:");
        
        System.out.println(o.containsKey(10));
        System.out.println(o.containsValue(76));
        System.out.println(o.contains(76));
        
        //rehashing
        //o.rehash(); 
        
        //size
        System.out.println(o.size());
        
        //extra operation
        System.out.println(o.toString());
        
        //entering null values.
        for(int i : new int[]{1,2,3,4,5})
            m1.put(i,null);
        System.out.println(m1);
    }
            
}
