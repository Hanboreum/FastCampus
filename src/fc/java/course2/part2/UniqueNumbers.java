package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers={1,2,3,4,5,6,7,1,2,9};
        Set<Integer> uniqueNums = new HashSet<>();

        for(int num : numbers){
            uniqueNums.add(num);
        }

        System.out.println("unique numbers :");
        for(int num : uniqueNums){
            System.out.println(num);
        }
    }
}
