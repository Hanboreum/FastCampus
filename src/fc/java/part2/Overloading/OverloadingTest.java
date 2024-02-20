package fc.java.part2.Overloading;

public class OverloadingTest {
    //정수형 실수형 같은이름 리턴
    public static void main(String[] args) {
        int a=3 ,b=8;
        //float af= 3.4f, bf = 44.6f;
        int sum = add(a,b);
        System.out.println("sum = " + sum);
        float fsum = add(43.9f,56.2f);
        System.out.println("fsum = " + fsum);
    }
    public static int add(int a, int b){
        int sum =0;
        sum = a+b;
        return sum;
    }

    public static float add( float a, float b){
        float sum = a +b;
        return sum;
    }
}
//타입이 다르기때문에 중복정의 가능 =  overloading
