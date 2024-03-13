package fc.java.course2.part2;

import fc.java.model2.MathOperation;

public class LambdaExample {
    public static void main(String[] args) {
        /* 익명함수. 조금 길고 복잡하다
        MathOperation add = new MathOperation() {
            @Override
            public int operation(int x, int y) {
                return x +y;
            }
        };

        int result = add.operation(10,20);
        System.out.println("result = " + result);*/

        MathOperation add = ( x, y)-> x+y;
        //(int x,y) -> {return x+y} ;
        MathOperation multi = (x,y) -> x *y;
        int addresult =add.operation(10,20);
        System.out.println("result = " + addresult);
        int multiresult = (multi.operation(5,5));
        System.out.println("multiresult = " + multiresult);
    }
}
