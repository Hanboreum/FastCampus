package fc.java.part2;

public class ArrayExam {
    public static void main(String[] args) {
        //초기화
        int x[] ={5,3,6,43};

        //캐릭터 배열에 APPLE 할딩하고 소문자로 출력
        char[] c={'a','c','d','e'};

        for(int i=0; i< c.length; i++){
            System.out.print((char)(c[i]+32));
        }
    }
}
