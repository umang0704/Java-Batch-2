package CollectionFramework;

import java.util.*;

 
public class LinkedHashSet1 {
    public static void main(String[] args) {
        
        //object creation
        Collection c = new LinkedHashSet();
        Set  s1 = new LinkedHashSet();
        LinkedHashSet lhs1 = new LinkedHashSet();
        
        
        //adding objects
        lhs1 = new LinkedHashSet(List.of(1,2,3,4,5,6,7,8,9,20));
        System.out.println(lhs1);
        lhs1.add(11);
        System.out.println(lhs1);
        lhs1.addAll(List.of(10,20,30,40));
        System.out.println(lhs1);
        
        
        //traversal
        for(Object o : lhs1){
            System.out.println(o);
        }
        lhs1.forEach(System.out::println);
        Iterator itr = lhs1.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
        //size
        System.out.println(lhs1.size());
        
        //copy
        s1 = Set.copyOf(lhs1);
        //s1.add(111);//RE-java.lang.UnsupportedOperationException
        Object[] o = lhs1.toArray();
        for(Object o1 : o)
            System.out.print(o1+" ");
        System.out.println("");
        
        //deletetion
        lhs1.remove(1);
        System.out.println(lhs1);
        lhs1.removeAll(List.of(10,20,30));
        System.out.println(lhs1);
        lhs1.retainAll(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(lhs1);
        lhs1.clear();
        
        
        
    }
}
