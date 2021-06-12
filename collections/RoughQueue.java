package collections;

import java.util.*;

public class RoughQueue {
	public static void main(String[] args) {
		System.out.println("Queue in PQ");
		Queue q1 = new PriorityQueue();
		q1.add(1);
		q1.offer(2);
		q1.add(3);
		System.out.println(q1);
		System.out.println(q1.poll());
		System.out.println(q1.peek()); 
		System.out.println(q1);
		
		System.out.println("PQ in PQ");
		PriorityQueue q2 = new PriorityQueue();
		q2.offer(1);
		q2.offer(2);
		q2.offer(3);
		q2.offer(4);
		q2.offer(5); 
		System.out.println(q2);
		
		System.out.println("DQ in ADQ");
		Deque dq1 =new ArrayDeque();
		dq1.offer(1);
		dq1.offer(2);
		dq1.offer(3);
		dq1.offer(4);
		dq1.offer(5); 
		
		System.out.println(dq1);
		dq1.add(10);
		System.out.println(dq1);
		dq1.addFirst(11);
		System.out.println(dq1);
		dq1.addLast(20);
		System.out.println(dq1);
		System.out.println(dq1.element());//returns head
		Iterator i1 = dq1.iterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		System.out.println("-------------");
		i1=dq1.descendingIterator();
		while(i1.hasNext())
			System.out.println(i1.next());
		System.out.println("-------------");	
		System.out.println(dq1.remove());
		System.out.println(dq1.poll());
		System.out.println(dq1.pollFirst());
		System.out.println(dq1.pollLast()); 
		System.out.println("LL in DQ"); 
		
		ArrayDeque adq1 = new ArrayDeque();

		
	}
}
