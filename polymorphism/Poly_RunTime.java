package polymorphism;

class A {

    int a = 10;

    protected void m1() {
        System.out.println("m1-A");
    }

//    public float aa(int x) {
//        return x;
//    }
}

class B extends A {

    int y = 20;
    int a = 11;

//    public int aa(int x) {
//        return x;
//    }

    public void m1() {
        System.out.println("m1-B");
    }
}

public class Poly_RunTime {

    public static void main(String[] args) {
        A obj1 = new A();
        System.out.println(obj1.a);
        obj1.m1();

//        B obj1 = new B();
//        System.out.println(obj1.a);
//        System.out.println(obj1.y);
//        obj1.m1();
//        A obj1 = new B();
//        System.out.println(obj1.a);
////        System.out.println(obj1.y);
//        obj1.m1();
    }
}
