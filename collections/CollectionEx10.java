package collections;

import java.util.*;
public class CollectionEx10 {
    public static void main(String[] args) {
        TreeSet a=new TreeSet();//Same type objects must be added, otherwise ClassCastException occured.
        a.add(40);
        a.add(10);
        a.add(10);
        a.add(29);
        a.add(25);
        System.out.println(a);
    }
}
