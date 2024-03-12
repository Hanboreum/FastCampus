package fc.java.course2.part2;

import java.util.*;

public class SortCompareTest {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("kim","lee","park");
        Collections.sort(names, String::compareTo);
        //String::compareTo 특정 객체의 메서드르 참조하는 방법
        System.out.println("names = " + names);

        for(String name: names){
            System.out.println(name);
        }
    }
}
