package fc.java.part4;

import fc.java.poly.A;
import fc.java.poly.B;

public class ObjectPolyArg {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        display(a);
        display(b);
    }

    private static void display(Object obj) { //
        // Obj를 활용한 다형성 인수를 확인해봤다

        if (obj instanceof A) {
            ((A) obj).printGO();
        }else{
            ((B)obj).printGo();
        }
    }
}

