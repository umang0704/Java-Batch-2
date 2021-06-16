package CollectionFramework;

import java.util.*;

public class NavigableSet1 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        SortedSet ss2 = new TreeSet(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        //creation:
        System.out.println("Creation:");
        NavigableSet ns1 = new TreeSet();
        NavigableSet ns2 = new TreeSet(ss2);
        System.out.println(ns1 + "\n" + ns2);

        //subsets
        System.out.println("Subset:");
        ns1 = ns2.subSet(2, true, 4, true);
        System.out.println(ns1);
        ns1 = ns2.subSet(1, false, 4, true);
        System.out.println(ns1);
//        ns1 = ns2.subSet(5,10); //CE
//        ns1 = (NavigableSet)ns2.subSet(5,10); //RE
        ns1 = ns2.tailSet(6, true);
        System.out.println(ns1);
        ns1 = ns2.tailSet(6, false);
        System.out.println(ns1);
        ns1 = ns2.headSet(6, true);
        System.out.println(ns1);
        ns1 = ns2.headSet(6, false);
        System.out.println(ns1);

        //lower(E), and higher(E) - exclusive
        //floor(E), ceiling(E) - inclusive
        System.out.println("lower(E), and higher(E) - exclusive\n"
                + "floor(E), ceiling(E) - inclusive");
        ns1 = new TreeSet(List.of(1, 3, 5, 7, 9, 11, 13, 15, 17, 19));
        System.out.println(ns1.lower(7));
        System.out.println(ns1.lower(6));
        System.out.println(ns1.higher(7));
        System.out.println(ns1.higher(6)); 
        
        System.out.println(ns1.ceiling(7));
        System.out.println(ns1.ceiling(6));
        System.out.println(ns1.floor(7));
        System.out.println(ns1.floor(6));
        
        //remove
        System.out.println(ns1);
        String y = ns1+"\n"+ns1.pollFirst()+"\n"+ns1.pollLast();
        System.out.println(y);

    }

}
