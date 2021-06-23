package CollectionFramework;

import java.util.*;
import java.util.stream.IntStream;

 
public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        TreeMap<Integer,Integer> tm1 = new TreeMap<>((x,y)->y-x);
//        TreeMap<Integer,Integer> tm1 = new TreeMap<>((x,y)->x-y);
        IntStream.rangeClosed(0, 25)
                .filter(x -> x % 2 == 0)
                .forEach((x) -> tm.put(x, x + 20));
        IntStream.rangeClosed(0, 25)
                .filter(x -> x % 2 == 0)
                .forEach((x) -> tm1.put(x, x + 20));
        System.out.println(tm);
        System.out.println(tm1);
    }
}
