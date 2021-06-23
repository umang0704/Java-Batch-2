package exception_handling;

import java.io.IOException;

class ThrowEx1A{
    int a ;
    int b;

    public ThrowEx1A(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    void divide(){
        if(b==0)
            throw new ArithmeticException();
        else
            System.out.println(a/b);
    }
    
//    void divide2(){
//        if(b==0)
//            throw new IOException();
//        else
//            System.out.println(a/b);
//    }
    
    void m2() throws IOException,ArithmeticException,NullPointerException{
        System.out.println(a/b);
    }
}

public class ThrowEx1 {
    public static void main(String[] args) {
        ThrowEx1A obj = new ThrowEx1A(1, 1);
        obj.divide();  
        try{
         obj.m2();
        }catch(Exception ex){
            ex.printStackTrace();
                    
        }
    }
            
}
