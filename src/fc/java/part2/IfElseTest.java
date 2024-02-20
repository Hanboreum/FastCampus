package fc.java.part2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x=10;
        if( x>=10){
            System.out.println("0,양수");
        }else{
            System.out.println("음수");
        }

        //짝홀
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }

        System.out.println("정수입력");
        int su = sc.nextInt();
        if(su%12 ==0){
            System.out.println("12의 배수");
        }else {
            System.out.println("12의 배수 아님");
        }

        //윤년, 4의 배수인 년도이거나  100으로 나누어 떨어지는 년도를 제외
        //의 배수인 년도
        int year = sc.nextInt();
         if(year%4==0 || year%100!=0 &&year %400==0){
             System.out.println("윤년");
        }else{
             System.out.println("운년아님");
         }
    }


}


