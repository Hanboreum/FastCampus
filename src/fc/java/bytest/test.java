package fc.java.bytest;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] divisors = new int[N];

        // 진짜 약수 입력받기
        for (int i = 0; i < N; i++) {
            divisors[i] = sc.nextInt();
        }

        // 최대값과 최소값 찾기
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            if (divisors[i] > max) {
                max = divisors[i];
            }
            if (divisors[i] < min) {
                min = divisors[i];
            }
        }

        // 결과 출력
        System.out.println(max * min);
    }
}