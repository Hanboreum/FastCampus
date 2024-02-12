package fc.java.bytest;

import java.util.Arrays;
import java.util.Scanner;

public class ct1037_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while( n -->0){
            int x = sc.nextInt();
            if(x > max) max =x;
            if( x < min) min =x;
        }
        System.out.println(max*min);
    }
}

