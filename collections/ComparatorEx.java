package collections;

import java.util.*;

class MyBook{
	private String name;
	private int price;
	private String author;
	public MyBook(String name, int price, String author) {
		this.name = name;
		this.price = price;
		this.author = author;
	}
        @Override
        public String toString() {
                return name+" "+price+" "+author;
        }
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getAuthor() {
		return author;
	}
}
public class ComparatorEx {
	public static void main(String[] args) {
		ArrayList<MyBook> books = new ArrayList();
		books.add(new MyBook("CoreJava",450,"Rahul"));
		books.add(new MyBook("AdvJava",350,"Rahul"));
		books.add(new MyBook("Python",550,"Praveen"));
		books.add(new MyBook("C",150,"Rajan"));
//                class BookComparePrice implements Comparator<MyBook>{
//                        @Override
//                        public int compare(MyBook b1, MyBook b2) {
//
//                                return b1.getPrice()-b2.getPrice();
//                        }
//                }
//		Collections.sort(books, new BookComparePrice());
//		System.out.println(books);
//                
//                class BookCompareName implements Comparator<MyBook>{
//                        @Override
//                        public int compare(MyBook b1, MyBook b2) {
//
//                                return b1.getName().compareTo(b2.getName());
//                        }
//                }
//		Collections.sort(books, new BookCompareName());
//		System.out.println(books);
                
                
                //using lambda exp. Increasing order
                Collections.sort(books, (a,b)-> a.getPrice()-b.getPrice() );
		System.out.println(books);
                
                Collections.sort(books, (a,b)-> a.getName().compareTo(b.getName()) );
		System.out.println(books);
                
                //using lambda exp. Decreasing order
                Collections.sort(books, (a,b)-> b.getPrice()-a.getPrice() );
		System.out.println(books);
                
                Collections.sort(books, (a,b)-> b.getName().compareTo(a.getName()) );
		System.out.println(books);
		
	}

}
