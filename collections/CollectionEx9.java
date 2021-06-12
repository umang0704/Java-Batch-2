package collections;

import java.util.*;
public class CollectionEx9 {
    public static void main(String[] args) {
        LinkedHashSet a=new LinkedHashSet();
        a.add(10);
        a.add("Hi");
        a.add(10);
        a.add(20);
        a.add(2.5);
        a.remove(3);
        System.out.println(a);
    }
}
