package inheritance;

class A {

    public int a = 10;

    public void display() {
        System.out.println(a);
    }

    public static void d() {
        System.out.println("Static method");
    }

    {
        System.out.println("Init A");
    }

    static {
        System.out.println("Static A");
    }

    A() {
        System.out.println("Constr - A");
    }
}

//single inheritance
class B extends A {

    int c = 10;

    public void s() {
        System.out.println(this.c);
    }

    public void d1() {
        System.out.println("Static method B");
    }

    {
        System.out.println("Init B");
    }

    static {
        System.out.println("Static B");
    }

    B() {
        System.out.println("Constr - B");
    }
}

public class Inheritance2 {

    public static void main(String[] args) {
        B obj = new B();
        obj.d();
        A obj1 = new B();
        //obj1.d1();
        A obj2 = new A();

       //B obj3 = new A();
    }
}
