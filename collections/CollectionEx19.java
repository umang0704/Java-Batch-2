package collections;

import java.util.*;
public class CollectionEx19 {
    public static void main(String[] args) {
        String a[]={"kapil","aman","rohit","ram"};
        var list=new ArrayList<>(Arrays.asList(a));
        //ArrayList<String> list=new ArrayList<>(Arrays.asList(a));
        
        list.sort((var x,var y)-> x.compareTo(y));
        //list.sort((x,y)-> x.compareTo(y));
        //list.sort((Integer x,Integer y)-> -x.compareTo(y));//error
        System.out.println(list);
        
        list.sort((var x,var y)-> -x.compareTo(y));
        System.out.println(list);
    }
}
