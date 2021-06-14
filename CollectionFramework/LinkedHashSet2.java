package CollectionFramework;

import java.util.*;

 
public class LinkedHashSet2 {
    public static void main(String[] args) {
        
        //object creation
        Collection c = new LinkedHashSet();
        Set  s1 = new LinkedHashSet();
        LinkedHashSet lhs1 = new LinkedHashSet();
        LinkedHashSet<Character> lhs2 = new LinkedHashSet<>();
        
        //adding objects
        lhs2.add('a');
        lhs2.add('\t');
        lhs2.add('\u0497');
        lhs2.add((char)98);
        System.out.println(lhs2);
       
        //traversal
        for(Object o : lhs2){
            System.out.println(o);
        }
        lhs2.forEach(System.out::println);
        Iterator itr = lhs2.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
        //size
        System.out.println(lhs2.size());
        
        //copy
        s1 = Set.copyOf(lhs2);
        //s1.add(111);//RE-java.lang.UnsupportedOperationException
        Object[] o = lhs2.toArray();
        for(Object o1 : o)
            System.out.print(o1+" ");
        System.out.println("");
        
        //deletetion
        lhs2.remove(1);
        System.out.println(lhs2);
        System.out.println(lhs2.removeAll(List.of(10,20,97)));
        System.out.println(lhs2);
        lhs2.retainAll(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(lhs2);
        lhs2.clear();
        
        
        
    }
}
