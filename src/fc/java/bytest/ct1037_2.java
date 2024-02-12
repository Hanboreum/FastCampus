package fc.java.bytest;

import java.util.Scanner;

public class ct1037_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); //진짜약수의 개수
        int[] Number = new int[N]; //진찌 약수를 저장할 배열
        int Max = 0;
        int Min = 0;

        //진짜약수 입력받기
        for(int i = 0; i < N; i++) {
            Number[i] = sc.nextInt();
            if(i == 0) {
                Max = Number[0];
                Min = Number[0];
            }
            if(Max < Number[i])
                Max = Number[i];

            if(Min > Number[i])
                Min = Number[i];
        }
        System.out.println(Max * Min); //원래수 구하기
    }
}



