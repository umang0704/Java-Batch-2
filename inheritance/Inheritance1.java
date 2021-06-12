package inheritance;
class A{
    public int a = 10;
    public void display(){
        System.out.println(a);
    }
    A(){
        System.out.println("Constr - A");
    }
}

class B extends A {
//    int c = 10;
//    public void s(){
//        System.out.println(this.c);
//    }
    B(){
        System.out.println("Constr - B");
    }
}

public class Inheritance1 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
