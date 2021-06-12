package collections;

import java.util.*;

class Kitab implements Comparable<Kitab> {
	int price;
	String name;

	Kitab(int price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (this.name + "-" + this.price);
	}

	@Override
	public int compareTo(Kitab o) {
		// TODO Auto-generated method stub
		return -this.name.compareTo(o.name);
//		return this.price - o.price;
	}
}

public class RoughComparable {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(new Kitab(5, "a"));
		a.add(new Kitab(15, "b"));
		a.add(new Kitab(53, "c"));
		a.add(new Kitab(25, "d"));
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}

}
