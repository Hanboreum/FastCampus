package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        //도서정보 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("title: ");
        String title = sc.nextLine();
        System.out.println("title = " + title);

        System.out.print("price: ");
        int price = sc.nextInt();
        System.out.println("price = " + price);

        sc.nextLine();

        System.out.print("company: ");
        String company = sc.nextLine();
        System.out.println("company = " + company);

        System.out.print("author: ");
        String author = sc.nextLine();
        System.out.println("author = " + author);

        System.out.print("page: ");
        int page = sc.nextInt();
        System.out.println("page = " + page);

        sc.nextLine();
        System.out.print("isbn: ");
        String isbn = sc.nextLine();
        System.out.println("isbn = " + isbn);


        sc.close();
    }
    
}
