package collections;

import java.util.*;
public class CollectionEx18 {
    public static void main(String[] args) {
        String a[]={"kapil","aman","rohit","ram"};
        List<List> list1=List.of(Arrays.asList(a));
        List list2=List.of(Arrays.asList(a));
        var list3=List.of(Arrays.asList(a));
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}
