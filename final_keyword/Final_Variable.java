package final_keyword;

class A {

    final static int b = 11;
    final int a = 10;

    static {

    }

    {

    }

    A() {
    }

    void m1() {

    }
}

class B {

    final int a;
    final static int b;

    static {
        b = 11;
    }

    {
        a = 10;
    }

    B() {

    }

    void m1() {
    }

}

public class Final_Variable {

    public static void main(String[] args) {
        A obj = new A();
        //obj.a=11;
    }
}
