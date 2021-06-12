package collections;

import java.util.*;
class Book implements Comparable<Book>{
    private String name;
    private int price;
    private String author;
    public Book(String name, int price, String author) {
            this.name = name;
            this.price = price;
            this.author = author;
    }
    @Override
    public String toString() {
            return name+" "+price+" "+author;
    }

    @Override
    public int compareTo(Book b) {
        
        //for sorting via price
        //return this.price-b.price ;//pehli(current wali) object - doosri(argument wali) object means: Increasing order
        //return b.price-this.price ; //doosri(argument wali) object - pehli(current wali) object means: Decreasing order
        
        //for sorting via name
        return this.name.compareTo(b.name);
        
    }
    
    
}
public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("ram");
        a.add("mohan");
        a.add("amit");
        Collections.sort(a);//for this sort methods Collection must be generic
        System.out.println(a);
        
        
        Book b1=new Book("CoreJava",1350,"Rahul");
        Book b2=new Book("AdvJava",1350,"Rahul");
        System.out.println(b1.compareTo(b2));
        
        
        
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("CoreJava",450,"Rahul"));
        books.add(new Book("AdvJava",350,"Rahul"));
        books.add(new Book("Python",550,"Praveen"));
        books.add(new Book("C",150,"Rajan"));
        Collections.sort(books);
        System.out.println(books);
        
    }
}
