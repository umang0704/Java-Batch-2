package collections;

import java.util.*;
/*
 * Vector
 * add()
 */
public class CollectionEx5 {
    public static void main(String[] args) {
        //ArrayList a=new ArrayList();//methods of ArrayList are not synchronized
        Vector a=new Vector(); //methods of Vector are synchronized 
        a.add(10);
        a.add(20);
        a.add(10);
        for(Object o:a){
             System.out.println(o);
        }
    }
}

/*
 * Output:
 * 10
 *20
 *10
 */