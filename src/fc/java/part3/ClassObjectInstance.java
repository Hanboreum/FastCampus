package fc.java.part3;

import fc.java.model.Student;

public class ClassObjectInstance {
    public static void main(String[] args) {
        Student st1; //st1 :object
        Student st2;
        Student st3;

        st1 = new Student("name0",20,"@google",2023); //생성 순간부터 instance st1 :instance

        st2 = new Student("name1",20,"@google",2023);
        st3 = new Student("name2", 20, "@google", 2023);

        System.out.println(st1.toString());

    }
}
