package fc.java.course2.part1;

import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
       // String str="Hello,world,java";
       // String str="Hello world java";
       // String[]arrArray = str.split(",");
        //String[]arrArray = str.split("\\s+");

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 입력");
        String str = sc.nextLine();
        String[] strArray = str.split("\\s+");
        for( String s: strArray){
            System.out.println(s);
        }
    }
}
