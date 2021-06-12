package collections;

import java.util.*;

public class RoughSet {
	public static void main(String[] args) {
		System.out.println("HashSet");
		HashSet a = new HashSet(1,2);
		System.out.println(a.size()); 
		a.add(1);
		a.add(2); 
		a.add(3);
		a.add(4);
		System.out.println(a);
		
		System.out.println("LinkedHashSet");
		LinkedHashSet b = new LinkedHashSet();
		System.out.println(b.size());
		b.add(1);
		b.add(2);
		b.add(3);
		b.add(4);
		System.out.println(b);
		System.out.println(b.size());
		
		System.out.println("Sorted Set");
		SortedSet c = new TreeSet();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);
		c.add(5);
		c.add(6);
		c.add(7);
		c.add(8);
		System.out.println(c);
		System.out.println(c.size());
		
		System.out.println("Navigable Set");
		NavigableSet ns = new TreeSet(c);
		SortedSet s1 = ns.headSet(3);
		SortedSet s2 = ns.subSet(3,6);
		SortedSet s3 = ns.tailSet(3);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		System.out.println("Navigable Set");
		NavigableSet ns1 = ns.descendingSet();
		System.out.println(ns1);
		
		System.out.println(ns1.ceiling(4));
		System.out.println(ns1.floor(4));
		System.out.println(ns1.higher(4));
		System.out.println(ns1.lower(4));
		System.out.println(ns1.pollFirst());
		System.out.println(ns1.pollLast());

		System.out.println(ns1);
		
		Iterator i = ns1.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
				
	
	}
}
