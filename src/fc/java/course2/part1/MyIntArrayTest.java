package fc.java.course2.part1;

import fc.java.model2.IntArray;

public class MyIntArrayTest {
    public static void main(String[] args) {
        //정수 3개 저장 후 배열 출력
        IntArray list = new IntArray(); //5개 크기의 정수형 배열
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        System.out.println(list.get(0));
//        System.out.println(list.get(2));
//        System.out.println(list.size());

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
