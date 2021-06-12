package oops;

class A {

    int a = 10;
    int b = 20;
    static int c = 10;
    void m1() {
        System.out.println(a + b);
    }
    
    static void m2(){
        System.out.println(c);
    }
    
    {
        System.out.println("init block");
    }
    A() {
        System.out.println("Constructor");
    }
}

public class OOP_Class4 {

    public static void main(String[] args) {

        A a = new A();  
        a.m2();
        
        System.out.println(A.c);
        A.m2();
  }

}
