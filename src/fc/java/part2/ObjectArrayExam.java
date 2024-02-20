package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        //영화 3편 ㅓ저장 출력
        Movie[] m =new Movie[3];
        m[0] = new Movie();
        m[0].mmajor = "kim";
        m[0].mday="2020,2022";
        m[0].mtitle="title";
        m[0].mlevel=15;

        m[1] = new Movie();
        m[1].mtitle="movie2";
        m[2] = new Movie();
        m[2] .mtitle="3M";

        for(int i=0; i<=m.length; i++) {
            System.out.println(m[i].mtitle);
        }
    }
}
