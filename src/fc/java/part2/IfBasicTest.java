package fc.java.part2;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        // x의 값이 0보다 큰 양수입니다 출력
        int x=10;
        if (x > 0) {
            System.out.println("양수입니다");
        }
        // 정수 1개를 입력받아 입력된 수가 7의 배수인지를 출력
        Scanner scan = new Scanner(System.in);
        System.out.println("정수입력");
        int num = scan.nextInt();
        if (num%7 ==0) {

            System.out.println("num = " + num + "은 7의 배수");
        }

        //나이 입력 19세 이상일 시 성인 출력
        System.out.println("나이 입력");
        int age = scan.nextInt();
        if( age >= 19){
            System.out.println(" 성인");
        }
        System.out.println("end");
    }
}
