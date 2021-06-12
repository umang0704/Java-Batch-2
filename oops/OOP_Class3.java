package oops;

class A {

    int a = 10;
    int b = 20;
    static int c = 10;
    void m1() {
        System.out.println(a + b);
    }
    {
        System.out.println("init block");
    }
    A() {
        System.out.println("Constructor");
    }
}

public class OOP_Class3 {

    public static void main(String[] args) {

        A a = new A();  
        A b = new A();
        
        System.out.println("a.c:"+a.c+" a.b:"+a.b);
        System.out.println("b.c:"+b.c+" b.b:"+b.b); 
        System.out.println("----------------------");
        
        b.b=16;
        
        System.out.println("a.c:"+a.c+" a.b:"+a.b);
        System.out.println("b.c:"+b.c+" b.b:"+b.b); 
        System.out.println("----------------------");
        
        b.c=155;
        
        System.out.println("a.c:"+a.c+" a.b:"+a.b);
        System.out.println("b.c:"+b.c+" b.b:"+b.b); 
        System.out.println("----------------------");
  }

}
