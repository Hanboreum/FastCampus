package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        //정수 6개를 저장할 배열을 생성
       int[]arr = new int[6];
       arr[0] =2 ;
        arr[1] =3 ;
        arr[2] = 4;
        arr[3] = 99;
        arr[4] = 7;
        arr[5] = 16;

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        //학생 객체 설계하고 출력
        Student std = new Student("name",12,"@google.com",2012);
        System.out.println(std);
    }
}
