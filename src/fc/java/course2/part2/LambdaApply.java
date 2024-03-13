package fc.java.course2.part2;

import fc.java.model2.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpper = s ->s.toUpperCase();
        //매개변수가 하나이기 떄문에 (s) 괄호 없어도 됨
        StringOperation toLower = s -> s.toLowerCase();
        //하나의 인터페이스로 두개의 동작을 만듦
        String input= "Lambda EXpressions";
        System.out.println(processString(input,toUpper));
        System.out.println(processString(input, toLower));
    }

    public static String processString(String input, StringOperation operation){
        return operation.apply(input);
    }
}
