package fc.java.part2;

public class MaxMinValue {
    public static void main(String[] args) {
        // 삼항연산자를 이용, 정수 2 개 중 max, min 출력
        int b = 10;
         int a =1;
         int min = (a<b)? a:b;
        System.out.println("min = " + min);
        
        int max = (a>b)? a:b;
        System.out.println("max = " + max);
    }
}
