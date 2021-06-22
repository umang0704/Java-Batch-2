package CollectionFramework;

import java.util.*;
import java.util.stream.IntStream;

 
public class LinkedHashMap1 {
    public static void main(String[] args) {
        //creation
        Map m1 = new LinkedHashMap();
        IntStream.range(0, 5).forEach(x->m1.put(x, x+7));   
        System.out.println(m1);
        LinkedHashMap m2 = new LinkedHashMap(50,0.75f,true);
        LinkedHashMap m3 = new LinkedHashMap(50,0.75f,false); 
        IntStream.range(0, 5).forEach(x->{m2.put(x, x+7);});  
        m2.put(3,"hi");
        IntStream.range(0, 5).forEach(x->m3.put(x, x+7));  
        System.out.println(m2);
        System.out.println(m3);
        
        //insertion
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
        
        //deletion
        System.out.println("\nClear:");
        
        System.out.println(m2);
        m2.clear();
        System.out.println(m2);
        
        System.out.println(m2);
        m2.remove(2);
        System.out.println(m2);
        
        m2.remove(1,67);
        m2.remove(3,60);
        System.out.println(m2);
        
        
        //searching
    System.out.println("\nSearching:");
        
        System.out.println(m2.containsKey(10));
        System.out.println(m2.containsValue(76));
        //System.out.println(m2.contains(76));
    
        //traversal
        //Map(I) -> static Entry(I) : Map.Entry = > Single entites of Key value pair
        
        Set<Map.Entry> entity = m1.entrySet();
        for(Map.Entry e : entity){
            System.out.println(e.getValue()+"->"+e.getKey());
        }
        
        
        //extra methods
        
    }
}
