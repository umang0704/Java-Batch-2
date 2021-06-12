package basics;

public class Basic2_DataTypes2 {
    public static void main(String args[]) {
        char a1 = 'a';
        double a = a1;
        System.out.println(a);
        a1 = (char) a;
        System.out.println((char) a);

        boolean b = true;
        boolean b1 = false;
        b = b1;
        b1 = b;
    }
}
