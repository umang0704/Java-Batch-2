package interfaces_abstractClasses;

//abstract class
abstract class A {

    int a = 10;
    static int b = 20;

    static {
        System.out.println("static A");
    }

    {
        System.out.println("init-A");
    }

    A() {
        System.out.println("const-a");
    }

    //abstract methods
    abstract void m1();

    //non abstract
    void m2() {
        System.out.println("m2-A");
    }
}

class B extends A {

    static {
        System.out.println("static B");
    }

    {
        System.out.println("init-B");
    }

    B() {
        System.out.println("const-B");
    }

    @Override
    void m1() {
    }

}

public class AC1 {

    public static void main(String[] args) {
        // A ob = new A();
        // B ob = new B();
        A ob = new B();
    }
}
