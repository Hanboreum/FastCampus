package fc.java.model;

public class AllStatic { //utility class
    private AllStatic(){}
   public static int hap(int a, int b){
       int v = a+b;
       return  v;
   }
   public static int max(int a, int b){
       return a>b? a:b;

       //a가 b보다 크면 a를 넘기고
   }
   public static int min(int a, int b){
       return a< b? a:b;
       //a가 b보다 작음 b 넘기기
   }
}
