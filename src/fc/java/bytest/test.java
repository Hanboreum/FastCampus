package fc.java.bytest;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       while(sc.hasNextInt()){
           int n = sc.nextInt();
           int num=0;

           for(int i=1; i<=n; i++){
               num = (num*10 +1) % n;

               if( num == 0){
                   System.out.println(i);
                   break;
               }
           }
       }
       sc.close();
    }
}