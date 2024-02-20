package fc.java.part2;

import java.util.Scanner;

public class IfElseIfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        //점수는 100점 미만6
        //60이상만 이하는 불합격
        if (score >= 0 && score <= 100) {
            if(score >=60) {
                if (score >= 95) {
                    System.out.println("A");
                } else if (score >= 80) {
                    System.out.println("B");
                } else if (score >= 70) {
                    System.out.println("C");
                } else if (score >= 60) {
                    System.out.println("D");
                }
            }else{
                System.out.println("failed");
            }
        }else{
            System.out.println("not available score");
        }
    }
}
