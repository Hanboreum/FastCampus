package fc.java.part3;

public class NoneStaticTest {
    public static void main(String[] args) {
        int a=10;
        int b=33;
        //int sum =add(a,b); add가 스테틱이 아니라 호출 안됨
        NoneStaticTest st = new NoneStaticTest();
        int sum = st.add(a,b);
        System.out.println("sum = " + sum);
    }
    public int add(int a, int b){
        int v = a+b;
        return v;
    }
}
