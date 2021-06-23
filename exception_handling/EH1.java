package exception_handling;

public class EH1 {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 0;
        int c = 0;
        try{
            c = a/b;
        }catch(ArithmeticException ex){
            ex.printStackTrace();
            System.out.println("Exception Caught"+ex); 
        }
        System.out.println("Operation finished / Code ends.");
        
        
        
        
        
        //int a = 10/0;
        //int b = Integer.parseInt("Hi");

        //String c = "";
        //System.out.println(c.length());

//        byte x = 1;
//        String d = c + 'a';

    }
}
