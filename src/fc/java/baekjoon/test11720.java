package fc.java.baekjoon;

import java.util.Scanner;

public class test11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //1-100이므로 String 사용
        String sNum = sc.next();
        //N값 입력받아 String sNum 에 저장
        //String을tocharArray사용해 char[]타입으로 나눔
        char[] cNum = sNum.toCharArray();
        int sum =0;
        for(int i=0; i< cNum.length; i++){
            sum +=cNum[i] - '0'; //혹은 -48
            //아스키 코드를 사용해char 을 int로 바꾼다
            //문자형 '1'솨 숫자 1은 48차이가 남
            //ex '1' -48 =1
        }
        System.out.println(sum);

    }
}
