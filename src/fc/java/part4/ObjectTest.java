package fc.java.part4;

import fc.java.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        Object obj = new A(); //upcasting
        ((A)obj).display(); //downcasting
    }
}
