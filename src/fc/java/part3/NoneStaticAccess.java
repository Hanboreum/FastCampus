package fc.java.part3;

import fc.java.model.MyUtil1;

public class NoneStaticAccess {
    public static void main(String[] args) {
        int a = 10;
         int b=20;
         //Myutill1서
        //객체 생성
         MyUtil1 my1 = new MyUtil1();
         int sum = my1.hap(a,b);
        System.out.println("sum = " + sum); //30
        //static 일 시,  int sum = MyUtil.hap(a,b);
    }
}
