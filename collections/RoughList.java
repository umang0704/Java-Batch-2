package collections;

import java.util.*;

public class RoughList {
	public static void main(String[] args) {
		
		//List Creation
		//1
		List lal = new ArrayList();
		lal.add(10);
		lal.add("hi");
		lal.add((Object)new Exception());
		
		System.out.println("list:arraylist "+lal);

		System.out.println("---------------------------------------------");
		//2
		List b = Arrays.asList(10,20,'h',new Exception());
		System.out.println("list:aslist "+b);

		System.out.println("---------------------------------------------");
		//3
		List c = List.of(10,'h');
		System.out.println("list.oflist "+c);

		System.out.println("---------------------------------------------");
		List d = new LinkedList();
		d.add(1);
		d.add('a');
		d.add(new Object());
		System.out.println("list:vector "+d);
		System.out.println("-------------------LL------------------------");
		LinkedList e = new LinkedList();
		e.addFirst(1);
		e.addLast(2);
		System.out.println(e+" "+e.getFirst()+" "+e.getLast());
		e.removeFirst();
		e.removeLast();
		System.out.println(d);

		System.out.println("----------------Vector--------------------------");
		Vector f = new Vector(2,10);
		System.out.println(f.size());
		System.out.println(f.capacity());
		f.add(1);
		f.add(2);
		f.addElement(3);
		f.insertElementAt(0, 0);
		f.setElementAt(11,1);
		System.out.println(f); 
		System.out.println(f.size());
		System.out.println(f.capacity());

		System.out.println("----------------Stack--------------------------");
		Stack g = new Stack();
		System.out.println("Capacity: "+g.capacity());
		System.out.println(g.size());
		g.push(1);
		g.push(null);
		g.push(2);
		g.push(1);
		g.push(2);
		g.push(1);
		g.push(2);
		g.push(1);
		g.push(2);
		g.push(1);
		g.push(2);
		g.push(2);
		System.out.println("Capacity Doubles"+g.capacity());
		System.out.println(g.size());
	}
}
