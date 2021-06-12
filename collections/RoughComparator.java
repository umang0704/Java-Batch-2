package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Kitab1{
	public int price;
	public String name;

	Kitab1(int price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.name + "-" + this.price);
	}
} 

public class RoughComparator {
	public static void main(String[] args) {
		List<Kitab1> a = new ArrayList();
		a.add(new Kitab1(5, "a"));
		a.add(new Kitab1(15, "b"));
		a.add(new Kitab1(53, "c"));
		a.add(new Kitab1(25, "d"));
		
		System.out.println(a);
		Collections.sort(a,(x,y)->x.price-y.price);
		System.out.println(a);
		Collections.sort(a,(x,y)->-(x.price-y.price));
		System.out.println(a);
		Collections.sort(a,(x,y)->x.name.compareTo(y.name));
		System.out.println(a);
		Collections.sort(a,(x,y)->-(x.name.compareTo(y.name)));
		System.out.println(a);
		
//		class KitabComparatorPrice implements Comparator<Kitab1>{
//			@Override
//			public int compare(Kitab1 o1, Kitab1 o2) {
//				// TODO Auto-generated method stub
//				//return o1.price-o2.price;
//				return -(o1.price-o2.price);
//			}
//		}
//		
//		class KitabComparatorName implements Comparator<Kitab1>{
//			@Override
//			public int compare(Kitab1 o1, Kitab1 o2) {
//				// TODO Auto-generated method stub
////				return o1.name.compareTo(o2.name);
//				return -o1.name.compareTo(o2.name);
//			}
//		}
//		
//		System.out.println(a);
//		Collections.sort(a,new KitabComparatorPrice());
//		System.out.println(a);
//		Collections.sort(a,new KitabComparatorName());
//		System.out.println(a);
	}
}
