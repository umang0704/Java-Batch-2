package CollectionFramework;

import java.util.*;

public class ArrayDeque1 {
    public static void main(String[] args){
        Queue q1 = new ArrayDeque();
        for(int i : new int[]{1,2,3,4,5,6,7,8,9,10}){
            q1.add(i);
        }
       System.out.println(q1); 
       //q1.addFirst(10);
       
       Deque d1 = new ArrayDeque(q1);
       System.out.println(d1);
       d1.addFirst(10);
       d1.offerFirst(100);
       //d1.addFirst("sd");
       //d1.offerFirst(null);
       System.out.println(d1);
       System.out.println(d1.remove(200));
       
       d1.addLast(20);
       d1.offerLast(100);
       System.out.println(d1);
       
       d1.removeFirstOccurrence(100);
       d1.removeLastOccurrence(100);
       System.out.println(d1);
       
       Iterator it1 = d1.iterator();
       while(it1.hasNext()) 
       System.out.println(it1.next());
       
       System.out.println("-----------");
       Iterator it2 = d1.descendingIterator();
       while(it2.hasNext()) 
       System.out.println(it2.next());
       
    }
 
}
