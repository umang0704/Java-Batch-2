package interfaces_abstractClasses;


interface A {
    
    int a = 10;

    void m1();
     
//    default void m2(){
//        
//    }
}

class B implements A {

    @Override
    public void m1() {
        System.out.println("m2 B");
    }

}

public class Interfaces1 {

    public static void main(String[] args) {
        B obj = new B();
        obj.m1();
       
        A obj1 = new B();
        obj1.m1();
    }
}
