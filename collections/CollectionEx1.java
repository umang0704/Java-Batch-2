package collections;

import java.util.*;
class A{
    
}
/*
List Interface with array List Object
add(Object o)
get(Object o)
size()
remove(int index)
remove(Object o)
removeAll(Collection c)
clear()
*/
public class CollectionEx1 {
    public static void main(String[] args) {
        List a=new ArrayList();
        a.add(10);
        a.add(56);
        a.add("hi");
        a.add(9.6);
        a.add(10);
        a.add(new A());
        System.out.println(a.size());
        System.out.println(a);
        int x=(int)a.get(1);
        System.out.println(x);
        a.remove(2);
        a.remove((Object)10);
        System.out.println(a);
        a.clear();
        System.out.println(a);
 
    }
}

/*
 * Output
6
[10, 56, hi, 9.6, 10, collections.A@470e2030]
56
[56, 9.6, 10, collections.A@470e2030]
[]

 */






