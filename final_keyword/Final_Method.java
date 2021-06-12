package final_keyword;

interface C {
    //final void A();
}

class A {

    final void hello() {
        System.out.println("Hello");
    }
}

class B extends A {

}

public class Final_Method {

    public static void main(String[] args) {
        B obj = new B();
        obj.hello();
    }
}
