package collections;

import java.util.*;

public class CollectionEx17 {
	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40 };
//		List<Integer> a0 = Arrays.asList(a);// here data type is Integer for List while Arrays.asList contans single
		// data as a primitive data type array
		List a1 = Arrays.asList(a, a);// This is possible as here no generic type and List contains data of type
										// arrays(ie object type)
		System.out.println(a1);
		Integer aa[] = { 54, 6, 8, 90, 66 };
		List<Integer> L1 = Arrays.asList(aa);//Here this is allowed as the data type of array provided is Integer only and not int
		
		Collections.sort(L1,(x,y)->x-y);
		System.out.println(L1);
		Collections.sort(L1,(x,y)->-(x-y));
		System.out.println(L1);
		Collections.sort(L1,(x,y)->y-x);
		System.out.println(L1);
		Collections.sort(L1,(x,y)->-(y-x));
		System.out.println(L1);
		

	}
}
