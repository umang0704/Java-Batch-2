package exception_handling;

import java.io.IOException;

class OverridingInException1 {

    void m1() {
        System.out.println("1-m1");
    }

    void m2() throws IOException {
        System.out.println("1-m2");
    }
}

class OverridingInException2 extends OverridingInException1 {
//    void m1() throws IOException{
//        System.out.println("2-m1");
//    }

    void m1() throws NullPointerException {
        System.out.println("2-m1");
    }
    void m2() throws IOException {
        System.out.println("1-m2");
    }
}

public class OverridingInException {

}
