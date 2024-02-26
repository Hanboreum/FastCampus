package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; //st1: object
        Student st2;// 객체변수
        Student st3;

        st1 =new Student("hong",13,"@com",2000);// st1 = instance
        st2 =new Student("Kim",11,"@com",2011);// r구체적인 대상을 가리킴
        st3 =new Student("Lee",1,"@comm",2024);

        System.out.println(st1.toString());
        System.out.println(st2);
        System.out.println(st3.toString());

    }
}
