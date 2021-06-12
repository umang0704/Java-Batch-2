package collections;

import java.util.*;
public class CollectionEx7 {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(12);
        s.push("hi");
        s.push(12);
        s.push(15);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s);
    }
}
