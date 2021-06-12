package CollectionFramework;

import java.util.*;

public class ArrayList1 {

    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        ArrayList<Integer> a2 = new ArrayList<>();
        System.out.println(a1.size());

        //constructors
        a1 = new ArrayList(20);
        a1 = new ArrayList(a2);

        a1.add("hi");
        a1.add("20");
        a1.add("Hello");
        a1.add(20);
        a1.add(new Integer(4));

        System.out.println(a1);
        System.out.println(a1.size());

        a1.add(1, 222);
        System.out.println(a1);
        System.out.println(a1.contains(222));

        List l1 = List.copyOf(a1);
        //l1.add(2);//RE- java.lang.UnsupportedOperationException
        System.out.println(l1);

        System.out.println(a1.get(1));
//        System.out.println(a1.indexOf(20));
//        System.out.println(a1.lastIndexOf(20));

        Iterator i1 = a1.iterator();
        while (i1.hasNext()) {
            System.out.println(i1.next());

        }
        System.out.println("---------------------");
        ListIterator li1 = a1.listIterator();
        while (li1.hasNext()) {
            System.out.println(li1.hasPrevious() + "-" + li1.next());

        }
        System.out.println("---------------------");
        ListIterator li2 = a1.listIterator(a1.size() - 1);
        while (li2.hasPrevious()) {
            System.out.println(li2.previous());

        }
        List l2 = List.of(a1, a2);
        System.out.println(l2);

        for (int i = 10; i >= 0; i--) {
            a2.add(i);
        }
        System.out.println(a2);
        Collections.sort(a2);
        System.out.println(a2);
        Collections.sort(a2, Collections.reverseOrder());
        System.out.println(a2);

        List<Float> l3 = new ArrayList<>();
        //l3.ensureCapacity(10);
        Collection<Float> c1 = new ArrayList<>();
        //c1.add(5,10);
    }
}
