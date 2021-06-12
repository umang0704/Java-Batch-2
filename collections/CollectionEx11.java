package collections;

import java.util.*;
public class CollectionEx11 {
    public static void main(String[] args) {
        SortedSet s=new TreeSet();
        s.add(3);
        s.add(11);
        s.add(40);
        s.add(2);
        System.out.println(s);//[ 2,3,11,40]
        NavigableSet ns=new TreeSet();
        ns.add(3);
        ns.add(11);
        ns.add(40);
        ns.add(2);
        System.out.println(ns);
        SortedSet s1=ns.headSet(3);
        System.out.println(s1);
        SortedSet s2=ns.tailSet(3);
        System.out.println(s2);
        SortedSet s3=ns.subSet(3, 40);
        System.out.println(s3);
        System.out.println(ns);
        System.out.println(ns.floor(10));
        System.out.println(ns.ceiling(10));
        System.out.println(ns.higher(10));
        System.out.println(ns.lower(10));
        System.out.println(ns.pollFirst());
        System.out.println(ns.pollLast());
        System.out.println("----------");
        NavigableSet ns2=ns.descendingSet();
        System.out.println(ns2.pollFirst());
        System.out.println(ns2.pollLast());
        System.out.println("----------");
        System.out.println(ns);
        System.out.println(ns2);
        Iterator i=ns.descendingIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
