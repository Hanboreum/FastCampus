package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {
    public static void main(String[] args) {

        //AllStatic st = new AllStatic();
        //System.out.println(st.hap(10,20));
        //System.out.println(st.max(10,20));

        //이게 더 바람직
        System.out.println(AllStatic.hap(10,20));
        System.out.println(AllStatic.max(20,409));
    }
}
