package fc.java.part3;

import fc.java.model.Student;

public class StudentArrayTest {
    public static void main(String[] args) {
        Student[] std = new Student[4];
        std[0] = new Student("name0","computer",20,"@google",2023,"010---");
        std[1] = new Student("name1","computer",20,"@google",2023,"010---");
        std[2] = new Student("name2","computer",20,"@google",2023,"010---");
        std[3] = new Student("name3","computer",20,"@google",2023,"010---");

        for(int i=0; i<std.length; i++){
            System.out.println(std[i].toString());
        }

        for(Student st  :std){
            System.out.println(st.toString());
        }

    }
}
