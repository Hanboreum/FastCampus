package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class FunctionInterfaceTest2 {
    public static void main(String[] args) {
        //MathOperation 인터페이스를  익명 내부 클래스로 구현 하자.
        //MathOperation mo = new MathOperation();인터페이스는 객체 생성이 불가함

        //이렇게 바로 구현
        //인터페이스는 존재하지만, 구현 클래스는 존재하지 않음 이것을 익명 클래스
        MathOperation mo = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x + y;
            }
        };

        int result = mo.operation(30,50);
        System.out.println(result);
    }
}
