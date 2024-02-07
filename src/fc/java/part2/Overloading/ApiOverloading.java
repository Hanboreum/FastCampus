package fc.java.part2.Overloading;

public class ApiOverloading {
    public static void main(String[] args) {
        System.out.println();
        int max = maxValue(7,9);
        System.out.println("max = " + max);
        int min = minValue(3,2);
        System.out.println("min = " + min);
    }
// 두개의 정수를 매개변수로 받아서 더 큰수를 리턴하는 메소드를 정의
    public static int maxValue(int a, int b){
        return (a>b) ? a:b;
    }
    //더작은수
    public static int minValue(int a, int b){
        return (a<b) ? a:b;
    }
}
