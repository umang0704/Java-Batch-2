package polymorphism;

class A {

    public void add(int a, int b) {
        System.out.println(a + b);
    }

    public void add(float a, float b) {
        System.out.println(a + b);
    }
    
    public void add(double a) {
        System.out.println(a);
    }
    
//    void arr(int... b){
//        
//    }
//    void arr(int[] b){
//        
//    }
}

public class Poly_CompileTime1 {
    public static void main(String[] args) {
        A obj = new A();
        obj.add(5,6);
        obj.add(5.0f,6.0f);
        obj.add(55.0);
    }
}
