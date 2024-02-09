package fc.java.bytest;

import java.util.Scanner;

public class ct4375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            long num = 1;
            if(n == 1) {
                System.out.println(1);
                break;
            }
            for(int i = 1; ; i++) {
                num = num * 10 + 1;
                num = num % n;
                if(num  == 0) {
                    System.out.println(i+1);
                    break;
                }
            }


        }

    }
}