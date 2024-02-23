package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] std = new Student[4];
        std[0] = new Student("1name",33,"@google.com",2022);
        std[1] = new Student("2name",13,"@daum.com",2002);
        std[2] = new Student("3name",23,"@hanmail.com",2032);
        std[3] = new Student("4name",24,"@naver.com",2001);

        for(int i=0; i<std.length; i++){
            System.out.println(std[i]);

        }
        System.out.println();

        for(Student st : std){
            System.out.println(st.toString());
        }
    }
}
