package collections;

import java.util.*;
public class CollectionEx13 {
    public static void main(String[] args) {
        PriorityQueue q=new PriorityQueue();
        //System.out.println(q.peek());//if queue is empty return null
        //System.out.println(q.element());//java.util.NoSuchElementException (if queue is empty)
        q.offer(1);
        //q.offer(1.3);//can not add different elements //ClassCastException
        q.offer(5);
        q.offer(50);
        q.offer(15);
        q.offer(7);
        System.out.println(q);
        System.out.println(q.poll());//if queue is empty return null
        System.out.println(q.remove());//java.util.NoSuchElementException (if queue is empty)
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q);
        
        //poll() and remove() methods: return object and delete also
        //peek() and element() methods: return object but do not delete
    }
}
