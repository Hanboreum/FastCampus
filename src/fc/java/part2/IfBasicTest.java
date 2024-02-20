package fc.java.part2;

import java.util.Scanner;

public class IfBasicTest {
    public static void main(String[] args) {
        // x의 값이 0보다 큰 양수입니다 출력
        int x=10;
        if(x>0){
            System.out.println("0보다 큰양수");
        }

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%7 ==0){
            System.out.println("7의 배수이다");
        }else {
            System.out.println("7의 배수가 아님");
        }

        //19이상이면 성인
        int age = sc.nextInt();
        if(age>19){
            System.out.println("adult");
        }else{
            System.out.println("kid");
        }

        sc.close();
    }
}
