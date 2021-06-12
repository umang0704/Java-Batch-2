package inheritance;

class A {
    private int a ;
    protected int b;
    public int c;

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b; 
        this.c = c; 
    }
    
}

class B extends A {

   void access(){
       //System.out.println(a);
       System.out.println(b);
       System.out.println(c);
   }
    
}

public class Inheritance_accessModifie1 {

    public static void main(String[] args) {
        B obj = new B();
        //System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c); 
       
    }
}
