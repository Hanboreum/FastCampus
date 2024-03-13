package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapStreamExample2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","Cherry","Banana");

        List<String> upper = words.stream()
                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("upper = " + upper);
        for(String str : upper){
            System.out.println(str);
        }
    }
}
