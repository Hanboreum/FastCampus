package fc.java.part3;

import java.util.Scanner;

public class StaticTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        int hap = StaticTest.add(a,b); //일반적으로 static을 부를땐 클래스 이름을 쓴다. 생략가능
        System.out.println("hap = " + hap);
    }
    //매개변수 두 개의 정수를 입력받아 리턴하는 메서드
    public static int add(int a, int b){
         int sum = a+b;
         return sum;
    }
}
