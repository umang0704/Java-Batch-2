package CollectionFramework;

import java.util.*;

 
public class HashMap1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        System.out.println(m1);
        m1.put(1,"hi");
        m1.put("hi",1);
        m1.put(null, 10);
        m1.put(null,'a');
        System.out.println(m1);
    }
            
}
