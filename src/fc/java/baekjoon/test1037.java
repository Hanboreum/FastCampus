package fc.java.baekjoon;

import java.util.Scanner;

public class test1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        while(num--> 0){
            int N = sc.nextInt();
            max = N > max ? N : max;
            min = N < min ? N : min;

        }
        System.out.println(max*min);
    }
}
