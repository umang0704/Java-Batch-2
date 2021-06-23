package CollectionFramework;

import java.util.*;
import java.util.stream.*;

 
public class SortedMap1 {
    public static void main(String[] args) {
        //Creation
        System.out.println("Creation:");
        SortedMap s1 = new TreeMap();
        System.out.println(s1);
        
        //Insertion
        System.out.println("\nInsertion");
        IntStream.range(0, 10).forEach(x->s1.put(10-x,(char)(75-x)));
        System.out.println(s1);
        
        //deletion 
        System.out.println("\nDeletion");
        IntStream.range(0, 10).forEach(x->{
            if(x%2!=0)
                s1.remove(x,(char)(x+65));
        });
        System.out.println(s1);
        
        //submap
        System.out.println("\nSub Maps");
        SortedMap hm = s1.headMap(4);
        System.out.println(hm);
        
        SortedMap tm = s1.tailMap(6);
        System.out.println(tm);
        
        SortedMap sm = s1.subMap(2, 8);
        System.out.println(sm);
                
        //traversal 
        Set<Map.Entry> entries = s1.entrySet();
        entries.forEach(x->System.out.println(x.getKey()+"->"+x.getValue()));
        
        //extra operations
        System.out.println(s1.firstKey()+" "+s1.lastKey());
    }
}
