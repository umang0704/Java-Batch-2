package basics;

public class Basic_Literals {

    public static void main(String[] args) {
        //Numbericle Literals
        //Integer
           int i1 = 10__0_0;
        //int i1 = _10__0_0_; // error
       
        //int - binary | only 0 , 1 is allowed
        int i2 = 0b101;//0B101
        System.out.println("Binary-101 : "+i2);
        Integer i3 = 10;
        System.out.println("Int to Bnary (5) : "+i3.toBinaryString(i3));
        //int - octal except 8 & 9 all digits are allowed (0-7)
        int i4 = 010;
        System.out.println("Octal to int(010) : "+i4); 
        System.out.println("Int to Bnary (10) : "+Integer.toOctalString(i3));
        //int - Hexadecimal after f no alphabet is allowed
        int i5 = 0xF12;
        System.out.println(i5);
        System.out.println("Int to Bnary (10) : "+Integer.toHexString(i3));
        
        //Charater Literals
         //ASCII - 97(a) & 65(A)
        char c1 = 'a';
        char c2 = '\u0000';//unicode
        char c3 = '\t';//esccape sequence  
        
        //String Literals
        String s1 ="Hi this is umang";
        char[] ch1 = s1.toCharArray();
        
        //Boolean Literals
        boolean b1 = true;//false;
    }

}
