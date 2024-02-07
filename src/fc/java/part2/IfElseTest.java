package fc.java.part2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int x = 10;
        if (x >= 0) {
            System.out.println("0 혹은 양수");
        } else {
            System.out.println("음수");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력");
        int su = scan.nextInt();
        if (su % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
        System.out.println("년도를 입력");
        int year = scan.nextInt();
        if ((year % 4 == 0 && year % 100 == 0) || (year % 400 == 0)) {
            System.out.println(" 윤년");
        } else {
            System.out.println(" 윤년 아님");
        }
    }
    }


