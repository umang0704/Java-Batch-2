package loops;
import java.util.Arrays;
public class Loop_for {

    public static void main(String[] args) {
        for (int i = 0 ; i < 10;  System.out.println("i: "+ ++i),System.out.println("i: "+ ++i)) {
            System.out.println(i + 1);
        }
        
        int arr[] = new int[10];
        Arrays.fill(arr,10);
        
        for(int e : arr){
            System.out.println(e);
        }
    }
}
