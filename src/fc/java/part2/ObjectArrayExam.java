package fc.java.part2;

public class ObjectArrayExam {
    public static void main(String[] args) {
        //영화 3편 ㅓ저장 출력
        Movie[] m = new Movie[3];
        m[0] = new Movie();
        m[0].mtitle="movieA";
        m[0].mmajor = "KIM";
        m[0].mtime = 180;
        m[0].mlevel = 15;
        m[0].mday = "20230101";

        m[1] =new Movie();
        m[1].mtitle="movieB";
        m[1].mmajor = "LEE";
        m[1].mtime = 170;
        m[1].mlevel = 18;
        m[1].mday = "20200101";

        m[2] = new Movie();
        m[2].mtitle="movieB";
        m[2].mmajor = "PARK";
        m[2].mtime = 200;
        m[2].mlevel = 12;
        m[2].mday = "20130101";

        for (int i = 0; i < m.length; i++) {
            System.out.println(m[i].mtitle +  m[i].mmajor);

        }
    }
}
