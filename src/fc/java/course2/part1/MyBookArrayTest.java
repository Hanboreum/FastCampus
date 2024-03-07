package fc.java.course2.part1;

import fc.java.model2.Book;
import fc.java.model2.BookArray;

public class MyBookArrayTest {
    public static void main(String[] args) {
        BookArray list = new BookArray(); //책 저장하고 출력하기
        //Book[]쓰지 않고
        list.add(new Book("java",30000));
        list.add(new Book("2java",20000));
        list.add(new Book("DB",33000));
        list.add(new Book("CS",40000));

        //출력에는 3가지 방법
        Book vo = list.get(0);
        System.out.println(list.get(0)); //vo.toString
       // vo = list.get(1);
        System.out.println(list.get(1)); //vo로 출력 가능
       // vo = list.get(2);
        System.out.println(list.get(2));
       // vo = list.get(3);
        System.out.println(vo.toString());

        System.out.println();
       for(int i=0; i<list.size(); i++){
           System.out.println(list.get(i));
        }
    }
}
