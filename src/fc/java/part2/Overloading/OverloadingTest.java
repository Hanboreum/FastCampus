package fc.java.part2.Overloading;

public class OverloadingTest {
    public static void main(String[] args) {
        float v = add(34.5f, 12.4f);
        System.out.println("v = " + v);
        int vv=  add(10,20);
        System.out.println("vv = " + vv);

    }
    //매개변수로 두개의 정수값을 받아/ 총합을 구해/ 리턴하는/ 메소드를 정의
    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static float add(float a, float b){
        float sum = a+b;
        return sum;
    }
}
//타입이 다르기때문에 중복정의 가능 =  overloading
