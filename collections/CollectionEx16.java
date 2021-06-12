package collections;

import java.util.*;

public class CollectionEx16 {
	public static void main(String[] args) {
		List<Integer> l1 = List.of(1, 2, 3, 4, 5);
		List<Integer> l2 = List.copyOf(l1);
                
		// single memory creation of l1 and l2
		System.out.println("l1.equals(l2)" + l1.equals(l2));
		System.out.println("l1==l2" + (l1 == l2));
		// addition and deletion is not allowed as immutable class exception is created
		// List.of() provide a runtime annonymous objects for List interface
//		l1.add(3);
//		System.out.println(l1+"-"+l2);
//		l2.add(6);
//		System.out.println(l1+"-"+l2);
//		l1.remove(1);
//		System.out.println(l1+"-"+l2);
//		l2.remove(3);
//		System.out.println(l1+"-"+l2);
		System.out.println("-------------------------------");
		List<String> l3 = new ArrayList<>();
		l3.add("Ram");
		l3.add("Ravan");
		l3.add("Lalu");
		
		List<String> l4 = List.copyOf(l3);

		System.out.println("l3.equals(l4)" + l3.equals(l4));//l3 and l4 have same values
		System.out.println("l3==l4" + (l3 == l4));//l3 and l4 points to different memory
		//here memory of l3 and l4 are made separately, so strucural modification are possible
		
		l3.add("hey");
		System.out.println(l3+"-"+l4);
//		l4.add("hi");
//		System.out.println(l3+"-"+l4);
		l3.remove("hey");
		System.out.println(l3+"-"+l4);
//		l4.remove("hi");
//		System.out.println(l3+"-"+l4);
		System.out.println("-------------------------------");
		
		List<String> L1=new ArrayList<>();
        L1.add("Ram");
        L1.add("Ravan");
        L1.add("Lalu");
        List<String> L2=L1;
        //no new memory is created, L1 and L2 refer to same memory.
        System.out.println("L1.equals(L2)" + L1.equals(L2));//L1 and L2 have same values
		System.out.println("L1==l4" + (L1 == L2));
		
		L1.add("hey");
		System.out.println(L1+"-"+L2);
		L2.add("heya");
		System.out.println(L1+"-"+L2);

	}
}
