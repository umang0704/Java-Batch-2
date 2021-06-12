package polymorphism;

class A {

    int a = 10;

    static void m1s() {
        System.out.println("m1s -a");
    }

    void m1() {
        System.out.println("m1-a");
    }

    static void m2s() {
        System.out.println("m2s -a");
    }

    void m2() {
        System.out.println("m2-a");
    }

}

class B extends A {

    int b = 20;

    static void m1s() {
        System.out.println("m1s -b");
    }

    void m1() {
        System.out.println("m1-b");
    }

}

public class Poly_ClassTypecasting {

    public static void main(String[] args) {
        A obj = new B();
        System.out.println(obj.a);
        
        B obj1 = (B) obj;
        
         
//        B obj1 = (B) new A();
//        System.out.println(obj1.a);
//        System.out.println(obj1.b);
//        obj1.m1();
//        obj1.m1s();
//        obj1.m2();
//        obj1.m2s(); 

    }
}
