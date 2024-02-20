package fc.java.bytest;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum =0;
        if( n%2 == 0){
            sum+= n;
        }
        System.out.println(sum);

    }
}