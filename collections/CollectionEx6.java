package collections;

import java.util.*;
/*
 * addFirst()
 * add()
 */
public class CollectionEx6 {
    public static void main(String[] args) { 
        LinkedList a=new LinkedList();
//        a.addFirst(10);
//        a.addFirst(20);
//        a.addFirst(10);
//        a.addFirst(21);
        
//        a.addLast(10);
//        a.addLast(20);
//        a.addLast(10);
//        a.addLast(21);

        a.addFirst(10);
        a.addLast(20);
        a.addLast(12);
        a.addFirst(21);
        a.add(1, 78);//add object by index 
        for(Object o:a){
             System.out.println(o);
        }
    }
}

/*
 * Output:
 * 
 */
