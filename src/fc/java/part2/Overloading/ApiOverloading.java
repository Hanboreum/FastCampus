package fc.java.part2.Overloading;

public class ApiOverloading {
    public static void main(String[] args) {
        int max = maxValue(54,5);
        System.out.println("max = " + max);
        int min = minValue(1,32);
        System.out.println("min = " + min);
    }
    //두개의 정수를 매개변스로 받아 더 큰 값을 리턴
    public static int maxValue(int a, int b){
        return (a>b)? a:b;
    }
    //작은 수 리턴
    public static int minValue(int a, int b){
        return (b>a)? a:b;
    }

}
