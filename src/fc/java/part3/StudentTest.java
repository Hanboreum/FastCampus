package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        //정수 6개를 저장할 배열을 생성
        int[] arr = new int[6];
        arr[0] = 0;
        arr[1] = 1;
        arr[2] =2;
        arr[3] = 3;
        arr[4] =4;
        arr[5] =5;


        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }

        Student vo = new Student("name","SW",23,"@google.com",2020,"010-00");
        System.out.println(vo.toString());

    }
}
