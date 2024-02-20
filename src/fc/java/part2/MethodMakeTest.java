package fc.java.part2;

public class MethodMakeTest {
    public static void main(String[] args) {
        int a=1;
        int b=2;
       //add라는 메소드를 호출해 두 수의 합을 받아보자
        int result = add(a,b);
        System.out.println(result);
    }
    //메서드는 독립적으로 정의해야함
    public static int add(int a, int b){
        int sum = a+b;
        return sum;
    }
}
