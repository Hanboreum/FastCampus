package fc.java.course2.part2;

import java.util.ArrayList;

public class CollectionBasic {
    public static void main(String[] args) {
        //ArrayList를 5개의 정수를 저장
        //array는 object[]. int 불가. integer사용해야함
        ArrayList<Integer> list = new ArrayList<>();
        //list.add(new Integer(10)); 이거시 정성이지마누autoboxing사요해
        list.add(10); //new Integer(10);
        list.add(3);
        list.add(1);
        list.add(40);
        list.add(50);

        for( int data : list){
            System.out.println(data);
        }
    }
}
