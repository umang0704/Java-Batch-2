package CollectionFramework;

import java.util.*;
import java.util.stream.*;

public class NavigableMap1 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //Creation
        System.out.println("Creation:");
        NavigableMap nm1 = new TreeMap();
        System.out.println(nm1);

        IntStream.rangeClosed(0, 25)
                .filter(x -> x % 2 == 0)
                .forEach((x) -> nm1.put(x, x + 20));
        System.out.println(nm1);

        //submaps
        System.out.println("\nSubMaps:");
        //head 
        System.out.println("\nHeadMaps:");
        NavigableMap nm2 = nm1.headMap(16, true);
        System.out.println(nm2);
        nm2 = nm1.headMap(16, false);
        System.out.println(nm2);

        //tail
        System.out.println("\nTailMaps:");
        nm2 = nm1.tailMap(16, true);
        System.out.println(nm2);
        nm2 = nm1.tailMap(16, false);
        System.out.println(nm2);

        //sub
        System.out.println("\nSubMaps:");
        nm2 = nm1.subMap(10, true, 20, true);
        System.out.println(nm2);
        nm2 = nm1.subMap(10, true, 20, false);
        System.out.println(nm2);
        nm2 = nm1.subMap(10, false, 20, true);
        System.out.println(nm2);
        nm2 = nm1.subMap(10, false, 20, false);
        System.out.println(nm2);

        //lower(E), and higher(E) - exclusive
        //floor(E), ceiling(E) - inclusive
        System.out.println("\nlower(E), and higher(E) - exclusive\n"
                + "floor(E), ceiling(E) - inclusive");
        NavigableMap nm3 = new TreeMap(nm1);
        System.out.println(nm3);
        
            //lower
            System.out.println("\nLower");
            System.out.println(nm3.lowerEntry(2));
            System.out.println(nm3.lowerKey(2));
            System.out.println(nm3.lowerEntry(3));
            System.out.println(nm3.lowerKey(3));
            //higher
            System.out.println("\nHigher");
            System.out.println(nm3.higherEntry(2));
            System.out.println(nm3.higherKey(2));
            System.out.println(nm3.higherEntry(3));
            System.out.println(nm3.higherKey(3));
            //floor
            System.out.println("\nFloor");
            System.out.println(nm3.floorEntry(2));
            System.out.println(nm3.floorKey(2));
            System.out.println(nm3.floorEntry(3));
            System.out.println(nm3.floorKey(3));
            //ceiling
            System.out.println("\nCeiling");
            System.out.println(nm3.ceilingEntry(2));
            System.out.println(nm3.ceilingKey(2));
            System.out.println(nm3.ceilingEntry(3));
            System.out.println(nm3.ceilingKey(3));
        //lastEntry and firstEntry
        System.out.println("\nlastEntry and firstEntry");
        System.out.println(nm3.lastEntry()+"->"+nm3.lastKey());
        System.out.println(nm3.firstEntry()+"->"+nm3.firstKey());
        
        
        //navigable key set
        System.out.println("\nNavigable key set");
        NavigableSet ns1 = nm3.navigableKeySet();
        ns1.forEach(x->System.out.print(x+" "));
        System.out.println(""); 
        
        //decsending map
        System.out.println("\nDescending Map");
        NavigableMap nm4 = nm3.descendingMap();
        System.out.println(nm4);
        ns1 = nm4.navigableKeySet();
        ns1.forEach(x->System.out.print(x+" "));
        System.out.println("");
        ns1 = nm4.descendingKeySet();
        ns1.forEach(x->System.out.print(x+" "));
        System.out.println("");
        
        //pollfirstEntry & pollLastEntry
        System.out.println("\nPoll First & Poll Last");
        System.out.println(nm3);
        System.out.println(nm3.pollFirstEntry());
        System.out.println(nm3);
        System.out.println(nm3.pollLastEntry());
        System.out.println(nm3);
    }
}
