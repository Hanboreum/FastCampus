package fc.java.baekjoon;

import java.util.Scanner;

public class test17427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //입력받은 자연수
        long sum = 0; // 약수의 합을 저장할 공간.1000000까지 입력할 것을 고려

        //1부터 n가지의 각 자연수 i에 대해
        for(int i = 1; i <= N; i++) {
            //i의 배수들의 합을 구하여 sum에 더함
            sum += (N/i) * i; //N을 i로 나눈 몫을 구함. 이는 i의 배수의 개수
            //이를 다시 i와 곱해 i의 배수들의 합을 구함
            //이렇게 구한 값을 sum에 저장
        }
        System.out.println(sum);
        //반복문을 통해 1부터 N까지의 각 자연수 i에 대해 i의 배수들의 합을 계산.
        //이를 누적하여 sum에 저징
        //이 과정을 통해 1부터 N까지의 모든 자연수에 대한 약수의 합을 구할 수 있다.
    }
}
