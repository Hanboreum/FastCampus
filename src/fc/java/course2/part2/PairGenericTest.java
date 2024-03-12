package fc.java.course2.part2;

import fc.java.model2.Pair;

import java.util.HashMap;
import java.util.Map;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("hello",1);
        System.out.println(pair.getKey());
        System.out.println(pair.getClass());

        //검색을 빠르게 할 수 있는 자료구조, 자바제공
        Map<String, Integer> maps = new HashMap<>();
        maps.put("abcd",1234);
        maps.put("efg",567);
        System.out.println(maps.get("abcd"));
        System.out.println( maps.get("efg"));
    }
}
