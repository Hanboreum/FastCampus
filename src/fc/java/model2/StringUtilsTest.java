package fc.java.model2;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils = new StringUtils();
        //인스턴스 메서드 참조 방식
        Convert<String, String> convert = stringUtils::reverse;

        String result = convert.convert("helloworldreverse");
        System.out.println("result = " + result);
    }
}
