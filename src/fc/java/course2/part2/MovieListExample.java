package fc.java.course2.part2;

import fc.java.model2.MovieDTO;

import java.util.ArrayList;

public class MovieListExample {
    public static void main(String[] args) {
        ArrayList<MovieDTO> movie = new ArrayList<>();
        movie.add(new MovieDTO("title1",200));
        movie.add(new MovieDTO("2title",120));

       for( MovieDTO m : movie){
            System.out.println(m);
       }

        System.out.println();

       String searchTitle = "title1"; //영화 제목 찾기
       for( MovieDTO m : movie){
           if( m.getTitle().equals(searchTitle)){
               System.out.println(m.getTitle());
               break;
           }
       }
    }
}
