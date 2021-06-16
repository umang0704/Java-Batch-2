package CollectionFramework;

import java.util.*;

 
public class SortedSets1 {
    public static void main(String[] args) {
        //creation
        SortedSet ss1 = new TreeSet();
        SortedSet ss2 = new TreeSet(List.of(10,9,8,7,6,5,4,3,2,1));
        SortedSet ss3 = new TreeSet(ss2);
        System.out.println("Creation");
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss3);
        SortedSet<Integer> ss4 = new TreeSet<>((x,y)->{return y-x;});
        for(int i : new int[]{10,9,8,7,6,5,4,3,2,1}){
            ss4.add(i);
        }
        System.out.println(ss4);
        
        //insertion
        for(int i : new int[]{10,9,8,7,6,5,4,3,2,1}){
            ss3.add(i);
            ss2.add(i);
        }
        System.out.println("Insetion:");
        System.out.println(ss2);
        System.out.println(ss3);
        
        //deletion
        System.out.println("Deletion:");
        ss4.remove(1);
        System.out.println(ss4);
        ss4.removeAll(List.of(2,4,6,8,10));
        System.out.println(ss4);
        ss4.retainAll(List.of(1,3,5,7));
        System.out.println(ss4);
        
        //traversal-Interation
        System.out.println("Iteration:");
        Iterator itr = ss3.iterator();
        while(itr.hasNext()) System.out.print(itr.next()+" ");
        System.out.println("");
        ss3.forEach(System.out::print);
        System.out.println("");
        ss4.forEach((x)->{System.out.print(x*2);});
        System.out.println(""); 
        
        //searching
        System.out.println("Searching:");
        System.out.println(ss3.contains(4));
        System.out.println(ss3.contains(11));
        System.out.println(ss3.containsAll(List.of(1,2,3,4,5,6,11)));
        System.out.println(ss3.containsAll(List.of(1,2,3,4,5,6))); 
        System.out.println(ss3.first());
        System.out.println(ss3.last());
        
        //subset
        System.out.println("Subset:");
        SortedSet su1 = ss3.headSet(4);
        System.out.println(su1);
        su1 = ss3.tailSet(5);
        System.out.println(su1);
        su1 = ss3.subSet(3, 8);
        System.out.println(su1);
        
         
    }
}
