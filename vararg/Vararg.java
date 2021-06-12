package vararg;

class A {

    public void showArray(int c,int... a) {
        for (int i : a) {
            System.out.println(i);
        }
    }
}

public class Vararg {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int c =10;
        new A().showArray(c,arr);
    }
            
}
