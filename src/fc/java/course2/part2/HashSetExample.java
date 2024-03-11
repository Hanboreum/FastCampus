package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String > set = new HashSet<>();
        set.add("apple");
        set.add("Cherry");
        set.add("banana");
        set.add("apple"); //중복 안된다
        System.out.println(set.size());

        for(String str : set){
            System.out.println(str); //중복은 출력이 안된다.
        }

        System.out.println();
        set.remove("banana");
        for(String str : set){
            System.out.println(str); //중복은 출력이 안된다.
        }

        //cherry가 포함되어 있는지
        boolean contains = set.contains("Cherry");
        System.out.println("set contains Cherry?" +contains);

        //셋이 비워졌는지
        set.clear();
        boolean empty = set.isEmpty();
        System.out.println("set is empty? "+ empty);

    }
}
