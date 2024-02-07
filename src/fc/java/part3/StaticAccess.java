package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = MyUtil.hap(a,b); //static일시, 클래스이름, 호출 메서드
        System.out.println(sum);
        //nonestatic일시 int sum = my1.hap(a,b);
    }
}
