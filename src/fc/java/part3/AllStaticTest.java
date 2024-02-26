package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {
        //AllStatic st =new AllStatic();
        //private AllStatic(){} 할 시 에러
       // System.out.println(st.hap(20,10));
        //System.out.println(st.max(10,29));
        //잘못된건 아닌데 뭔가 이상한 접근 방법..
        System.out.println(AllStatic.hap(10,30));
        System.out.println(AllStatic.min(30,59));

        //자바에서 생성해주는 클래스.
        System.out.println(Math.min(4,3));
        System.out.println(Math.max(3,5));
    }
}
