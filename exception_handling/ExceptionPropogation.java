package exception_handling;

import java.io.IOException;

class ExceptionPropogation1{
    void m1(){
        //throw new IOException();
    }
    
     void m2(){
       try{
        m1();
       }catch(Exception ex){
           ex.printStackTrace();
       }
    }
}

class ExceptionPropogation2{
    void m1() throws IOException{ 
        throw new IOException();
    }
    
    void m2(){
       try{
        m1();
       }catch(Exception ex){
           ex.printStackTrace();
       }
    }
}
public class ExceptionPropogation {
    public static void main(String[] args) {
        new ExceptionPropogation1().m2();
        new ExceptionPropogation2().m2();
    }
}
