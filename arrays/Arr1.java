package arrays;

import java.util.Arrays;
import java.util.Collections;

public class Arr1 {

    public static void main(String[] args) {
        int[] d = new int[]{1, 2, 3, 4, 5};
        int a[] = new int[5 / 2];
        int[] b = {1, 2, 3, 4, 5, 6};
        a[0] = 1;
        a[1] = 3;
        System.out.println(a.length);
        for (int i : a) {
            System.out.println(i);
        }
        Arrays.fill(b, 0);
        for (int i : b) {
            System.out.println(i);
        }

        Integer[] c = {2, 4, 19, 3, 11, 8, 5};
        Arrays.sort(c);
        Arrays.sort(c, 0, 4);
        for (int i : c) {
            System.out.println(i);
        }
        Arrays.sort(c, Collections.reverseOrder());
        for (int i : c) {
            System.out.println(i);
        }
        int[] e = new int[a[0]];
    }
}
