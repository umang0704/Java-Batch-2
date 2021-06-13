package CollectionFramework;

import java.util.*; 
public class LinkedList1 { 
    public static void main(String[] args) {
        List l = new LinkedList();
        l.add(1);
        l.add(2);
        
        System.out.println(l);
        
        Deque dl1 = new LinkedList();
        for(int i : new int[]{1,2,3,4,5,6,7,8,9,10}){
            dl1.add(i);
        }
        
        System.out.println(dl1);
        
        
        System.out.println("--------add & offer-----------");
        dl1.addFirst(11);
        dl1.addLast(12);
        dl1.offerFirst(11);
        dl1.offerLast(12);
        System.out.println(dl1);
        
        System.out.println("--------peek-----------");
        System.out.println(dl1);
        System.out.println(dl1.peekFirst());
        System.out.println(dl1.peekLast());
        System.out.println(dl1);
        
        System.out.println("--------remove-------------");
        System.out.println(dl1);
        System.out.println(dl1.removeFirst());
        System.out.println(dl1.removeLast());
        System.out.println(dl1);
        
        
        System.out.println("--------poll-----------");
        System.out.println(dl1);
        System.out.println(dl1.pollFirst());
        System.out.println(dl1.pollLast());
        System.out.println(dl1);
        
        
    }
}
