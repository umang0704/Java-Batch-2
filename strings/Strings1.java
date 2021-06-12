package strings;

public class Strings1 {

    public static void main(String[] args) {
        char[] a = new char[]{'t', 'u', 'e', 's', 'd', 'a', 'y'};
        for (char x : a) {
            System.out.print(x);
        }
        System.out.println(a.length);

        String s1 = new String(a);
        System.out.println(s1);

        Integer x  = 29;
        String a1 = x.toString();
        System.out.println(a1); 
        
        //String litrerals: "hi" , "Hello"
        String s2 = new String("Rahul");
        String s4 = new String("Rahul");
        
        String s3 = "Rahul";
        String s5 = "Rahul";
        
        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));
        
        System.out.println(s3==s5);
        System.out.println(s3.equals(s5));
    }
}
