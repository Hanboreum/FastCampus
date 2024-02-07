package fc.java.part2;

import java.util.*;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print(" 정수입력");
        int num = scan.nextInt();
        System.out.println("num = " + num);

        System.out.print(" 실수입력");
        float f =scan.nextFloat();
        System.out.println("f = " + f);

        System.out.print("  문자입력");
        String str = scan.next();
        System.out.println("str = " + str);

        scan.nextLine();

        System.out.print("  문자열입력");
        String str1 = scan.nextLine();
        System.out.println("str = " + str1);

        scan.close();
    }
}
