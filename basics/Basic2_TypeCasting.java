package basics;
 
 
public class Basic2_TypeCasting {
    public static void main(String args[]) { 
        //implicit & explicit
        byte b1 = 10;
        int i1 = b1;
        
        b1 =(byte) i1;
        
        double a = 10;
        double b = 20; 
        int d = (int)(a/b + 0.5);
        
        System.out.println(d);
        
        short s1 = 128;
        b1 = (byte)s1;
        System.out.println(b1);
        
        //type casting
        b1=1;
        b1 = (byte)(b1+1);
        b1++; //incree or decree
        b1+=3;//short hand
    }
}
