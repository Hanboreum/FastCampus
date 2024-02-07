package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        //도서정보 입력 받기
        Scanner scan = new Scanner(System.in);
        System.out.println("제목 입력");
        String title = scan.nextLine();
        System.out.println("title = " + title);

        System.out.println("price");
        int price = scan.nextInt();
        System.out.println("price = " + price);

        scan.nextLine();

        System.out.println("writer");
        String writer = scan.nextLine();
        System.out.println("writer = " + writer);

        scan.close();
    }
    
}
