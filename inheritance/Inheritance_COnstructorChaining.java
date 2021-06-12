package inheritance;

class A {

    private int a = 10;
    int b = 20;
    
    public void setA(int a){
        this.a=a;
    }
    
    public void m1() {
        System.out.println(a + b);
    }
    // this
    /*
        - it can only be written in first execution line of the constructor
        - chaining krke cycle nahi banani hai.
    */
    A() { 
        this(51); 
        System.out.println("Non Param"); 
        
    }

    A(int a) { 
        this(true);
        System.out.println("Param - int");
    }

    A(boolean a) { 
        System.out.println("Param - boolean");
    }
}

public class Inheritance_COnstructorChaining {
    public static void main(String[] args) {
        A a1 = new A();
//        A a2 = new A(5);
//        A a3 = new A(true);
    }
}
