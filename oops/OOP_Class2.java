package oops;

class A {

    private int a = 10;
    private int b = 20;

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

public class OOP_Class2 {

    public static void main(String[] args) {
        //creation of object
        /*
            * Class Loading    
            *reference creation
            *new - memory allocation
            * constructor calling
        */
        A obj = new A();
        obj.m1(); 
   }

}
