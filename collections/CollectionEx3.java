package collections;

import java.util.*;
public class CollectionEx3 {
    public static void main(String[] args) {
        List a=new ArrayList();
        a.add(10);
        a.add(56);
        a.add("hi");
        a.add(9.6);
        a.add(10);
        a.add(new A());
        a.set(3, 8.9);
        for(Object o:a){
            System.out.println(o);
        }
        System.out.println(a);
        Iterator i=a.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
            i.remove();
        }
        System.out.println(a);
    }
}
/*
ArrayList and Iterator(for array list)
add(Object)
add(int, Object)
set()
iterator()
hasNext()
next()
remove()-do not eork with list created from as List.
*/

/*
 * Output
 * 10
 * 56
 * hi
 * 8.9
 * 10
 * collections.A@470e2030
 * [10,56,hi,8.9,10,collections.A@470e2030]
 * 10
 * 56
 * hi
 * 8.9
 * 10
 * collections.A@470e2030
 * []
 */
