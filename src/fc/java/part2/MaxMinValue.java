package fc.java.part2;

public class MaxMinValue {
    public static void main(String[] args) {
        // 삼항연산자를 이용, 정수 2 개 중 max, min 출력
        int a =10;
        int b =20;
        //min val 구하기
        int min = (a<b ? a:b);
        System.out.println("min = " + min);
        //max
        int max = (b<a ? a:b); //20<10 ? t: f
        System.out.println("max = " + max);
    }
}
