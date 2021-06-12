package collections;

import java.util.*;
public class CollectionEx12 {
    public static void main(String[] args) {
        //Map interface is not the child of Collection interface
        //HashMap m=new HashMap();   //methods are not synchronized
        //Hashtable m=new Hashtable(); //methods are synchronized
        LinkedHashMap m=new LinkedHashMap();
        m.put("rr", 6);
        m.put(2, 4);
        m.put("kk", 4);
        m.put(3, "ram");
        m.put(6, "mohan");
        m.put("oo", "pk");
        System.out.println(m);
        Set s=m.entrySet();
        
        for(Object o:s) {
                Map.Entry e=(Map.Entry)o;
                //e.setValue(8);
                System.out.println(e+"-"+o);
                System.out.println(e.getKey());
                System.out.println(e.getValue());
        }
        System.out.println("------------------");
        Iterator i=s.iterator();
        while(i.hasNext()) {
                Map.Entry e=(Map.Entry)i.next();
                System.out.println(e.getKey());
                System.out.println(e.getValue());
        }
        
        System.out.println("------------------");
        TreeMap tm=new TreeMap();//key must be of same type, otherwise ClassCastException
        tm.put("ram",10);
        tm.put("jite",40);
        tm.put("sonu","jj");
        tm.put("tina",1.90);
        tm.put("mohan",10);
        System.out.println(tm);
    }
}
