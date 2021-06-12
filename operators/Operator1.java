package operators;

public class Operator1 {
    public static void main(String[] args) {
        int a = 10;
        //arith - same priorit left to right
        System.out.println(a*10+20/3);
        //short hand
        int i2 = 1;
        //i2 = i2 + 10;
        i2 += 10;
        System.out.println(i2);
        
        //relational
        System.out.println(5<5);
        System.out.println(5<5);
        System.out.println(10>5);
        System.out.println(10>=5);
        System.out.println(10!=5); 
        System.out.println(!(5<5));
        System.out.println(!(5<5));
        
        //logical - between boolean values
         System.out.println(5<5 && 10>5);
         System.out.println(5<5 || 10>5);
         System.out.println(!(5<5 && 10>5));
         
         //conditional
         System.out.println(5<10?true:false);
         
         //bitwise
         System.out.println(2&2);//and
         System.out.println(2|3);//or
         System.out.println(2<<1);//shift left with 1
         System.out.println(4>>1);//shift right with 1
         System.out.println(4^2);//xor - diff -> true or 1 same-> false or 0
         System.out.println(~a);//~a = -(a+1)
        
    }
}
