package collections;

import java.util.*;
public class CollectionEx15 {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add(23);
        a.add(2.3);
        a.add("hi");
        //int y=a.get(0);
        for(Object n:a)
            System.out.println(n);
        
        ArrayList<Integer> a2=new ArrayList<>();//primitive generic not allowed
        a2.add(12);
        //a2.add(2.3);
        a2.add(14);
        int x=a2.get(0);
        
        for(int n:a2)
            System.out.println(n);
        
        ArrayList<Integer> b=new ArrayList<Integer>();
        //ArrayList<Integer> b=new ArrayList<Double>();//error
        //ArrayList<Number> c=new ArrayList<Integer>();//error
        //ArrayList<Integer> c=new ArrayList<Number>();//error
        //ArrayList<> c=new ArrayList<Integer>();//error
        ArrayList<Integer> c=new ArrayList<>();
        ArrayList<Integer> d=new ArrayList();
        
        ArrayList e=new ArrayList<Integer>();//this is not generic collection, for generic reference must be generic
        e.add(3.2);
        
        List f=new ArrayList<Integer>(); //this is not generic collection, for generic reference must be generic
        List<Integer> g=new ArrayList<Integer>();
        Collection h=new ArrayList<Integer>();//this is not generic collection, for generic reference must be generic
        Collection<Integer> i=new ArrayList<Integer>();
        
        //List<Object> g=new ArrayList<Integer>();//error
	//List<> j=new ArrayList<Integer>();//error due to List<>
        
    }
}
