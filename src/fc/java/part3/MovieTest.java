package fc.java.part3;

import fc.java.part2.Movie;

public class MovieTest {
    public static void main(String[] args) {
        Movie mv =new Movie();

        mv.mday="20230101";
        mv.mtitle="avatar";
        mv.mlevel=12;
        mv.mmajor="action";
        mv.mtime=140;

        System.out.println(mv.mtitle + "\t"+ mv.mmajor);
    }
}
