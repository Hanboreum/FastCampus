package fc.java.part2;

import java.util.*;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수입력");
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("실수");
        float fsc = sc.nextFloat();
        System.out.println(fsc);

        System.out.println("공백 X문자열");
        String ssc = sc.next();
        System.out.println("ssc = " + ssc);

        sc.nextLine();//버퍼 비우기. 스트ㅡ림비우기

        System.out.println("String");
        String sssc = sc.nextLine();
        System.out.println("sssc = " + sssc);

        sc.close(); //연결 끊기

    }
}
