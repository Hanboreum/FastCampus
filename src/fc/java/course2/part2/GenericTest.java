package fc.java.course2.part2;

import fc.java.model2.Book;
import fc.java.model2.MovieDTO;
import fc.java.model2.ObjectArr;

public class GenericTest {
    public static void main(String[] args) {
        /*ObjectArr<String> arr = new ObjectArr<>(5);
        arr.set(1,"hello");
        arr.set(0,",world");
        arr.set(2,"java");

        for(int i=0; i< arr.size();i++){
            System.out.println(arr.get(i));
        }*/

        ObjectArr<MovieDTO> mlist = new ObjectArr<>(5);
        mlist.set(0,new MovieDTO("movie",123));
        mlist.set(1, new MovieDTO("2title",111));

       for(int i=0; i<mlist.size(); i++){
           System.out.println(mlist.get(i));
       }
    }
}
