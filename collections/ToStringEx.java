package collections;

class MyClass{
    int x;
    String y;
    public String toString(){
        return "hi my class";
        //return x+y;
    }
}
public class ToStringEx {
    public static void main(String[] args) {
        MyClass m=new MyClass();
        m.x=10;
        m.y="ram";
        System.out.println(m.toString());
        System.out.println(m);
        
    }
}
