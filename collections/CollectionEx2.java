package collections;

import java.util.*;

/*
ArrayList
Arrays.asList(,,,...,);
size()
*/

public class CollectionEx2 {
    public static void main(String[] args) {
        List a=Arrays.asList(10,56,"hi",9.6,10,new A());
        //ArrayList a=Arrays.asList(10,56,"hi",9.6,10,new A());//error
        System.out.println(a.size());
        System.out.println(a);
    }
}

/*
Output
6
[10,56,"hi",9.6,10,collections.A@365345]
*/