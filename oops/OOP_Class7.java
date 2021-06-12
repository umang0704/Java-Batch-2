package oops;

class A { 
    {
       a=1; 
       //System.out.println(a);
    }
    int a = 2;
    static{
        //System.out.println(b);
        b=2;
    }
    static int b = 10;
    A(){
        a=10;
        b=10;
        System.out.println(a);
        a++;
    }
     
}

public class OOP_Class7 {

    public static void main(String[] args) {

        A a = new A();  
        System.out.println(a.a);
  }

}
