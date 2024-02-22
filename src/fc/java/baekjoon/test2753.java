package fc.java.baekjoon;

import java.util.Scanner;

public class test2753 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if((year%4==0 && year%100!=0)||year%400==0) {
            System.out.println("윤년");
        }else {
            System.out.println("윤년아님");
        }

    }
}
