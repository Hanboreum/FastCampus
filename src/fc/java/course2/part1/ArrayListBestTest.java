package fc.java.course2.part1;

import fc.java.model2.Book;

import java.util.ArrayList;

public class ArrayListBestTest {
    public static void main(String[] args) {
        ArrayList<Book> list = new ArrayList<Book>(); //기본 사이즈 10
        //List list = new ArrayList(); 이것도 가능
        //Book 만 사용하겠다. object는 의미가 없어지고 Book만.
        //업 다운 캐스팅이 없어져 쉽다.
        list.add(new Book("java",30000));
        list.add(new Book("2java",20000));
        list.add(new Book("DB",33000));
        list.add(new Book("CS",40000));

        System.out.println(list.get(0));
        Book vo = list.get(1); //ㅠㅐㅐㅏ ->Book 타입으로, 다운 캐스팅 해야함.
        System.out.println(vo);

        vo = list.get(2);
        System.out.println(vo);

        for( int i=0; i<list.size(); i++){
           Book b = list.get(i);
            System.out.println(b); // list.get(i)
        }
    }
}
