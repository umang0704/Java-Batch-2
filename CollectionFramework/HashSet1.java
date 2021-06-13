package CollectionFramework;

import java.util.*;

 
public class HashSet1 {
    public static void main(String[] args) {
        Set s = new HashSet();
        for(int i : new int[]{1,2,3,4,5,6,7,8,9,10}){
            s.add(i);
        }
        HashSet s1 = new HashSet(s);
        System.out.println(s);
        ArrayList a = new ArrayList(s);
        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
        
        System.out.println(s.remove(3));
        System.out.println(s.contains(4));
        System.out.println(s.size());
        Object[] arr = s.toArray();
        for(Object i :  arr){
            System.out.println(i);
        }
        s.retainAll(List.of(1,2,3,4,5,6,7,8,9));
        System.out.println(s);
        
        s.removeAll(List.of(2,4,6,8));
        System.out.println(s);
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(new HashSet(s1).hashCode());
        
        Iterator itr = s.iterator();
        while(itr.hasNext())
            System.out.println(itr.next());
        
    }
}
