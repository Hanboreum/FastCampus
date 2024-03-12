package fc.java.course2.part2;

import fc.java.model2.Convert;
import fc.java.model2.IntegerUtils;

public class IntegerUtilsTest {
    public static void main(String[] args) {
        Convert<String, Integer> convert = IntegerUtils::stringToInt;
        //stringToInt를 참조하겟다. 정적 메소드 참조.
        //클래싀름::정적메서드이름

        Integer result = convert.convert("123");
        //integer로 convert.convert로 받겠다, int 로 받을 수도 있다.
        System.out.println("result = " + result);
    }
}
