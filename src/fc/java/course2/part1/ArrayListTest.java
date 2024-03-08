package fc.java.course2.part1;

import fc.java.model2.Book;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //book 3권을 배열에 저정하고 출력
        //Book[], Object[]
        //ARrayList = ObjectArray
        ArrayList list = new ArrayList(); //기본 사이즈 10
        //List list = new ArrayList(); 이것도 가능
        list.add(new Book("java",30000));
        list.add(new Book("2java",20000));
        list.add(new Book("DB",33000));
        list.add(new Book("CS",40000));

        System.out.println(list.get(0));
        Book vo = (Book)list.get(1); //object ->Book 타입으로, 다운 캐스팅 해야함.
        System.out.println(vo);

        vo = (Book)list.get(2);
        System.out.println(vo);

        for( int i=0; i<list.size(); i++){
            //System.out.println((Book)list.get(i));
            System.out.println();
            System.out.println(list.get(i));
        }
    }
}
