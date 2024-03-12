package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class FunctionInterfaceTest implements MathOperation {
    public static void main(String[] args) {
        MathOperation mo = new FunctionInterfaceTest();
        int result =  mo.operation(4,5);
        System.out.println("result = " + result);
        System.out.println(mo.operation(5,6));
    }

    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
