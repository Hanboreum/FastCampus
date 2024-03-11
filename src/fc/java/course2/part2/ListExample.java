package fc.java.course2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Apple");
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println(list.size()-1);

        //remove 삭제
        list.remove(0);
        list.set(0,"Orange");

        for( String str : list){
            System.out.println(str);
        }

    }
}
