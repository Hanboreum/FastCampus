package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a=1;
        int b=2;
       //add라는 메소드를 호출해 두 수의 합을 받아보자
       int result = add(a,b);
        System.out.println("result = " + result);
    }
    //매개변수로 2개의 정수를 받아서 총합을 구해 리턴하는 메서드를 정의
    public static int add( int a, int b){
        int sum= a+b;
        return sum;

    }
}
