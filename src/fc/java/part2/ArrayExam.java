package fc.java.part2;

public class ArrayExam {
    public static void main(String[] args) {
        //캐릭터 배열에 APPLE 할딩하고 소문자로 출력
        int a = 10;

        int [] b = new int[3];
        b[0] = 1;
        b[1] =2;
        b[2] = 3;

        int[] x = {1,2,3,4};
        for (int i = 0; i <x.length ; i++) {
            System.out.println(x[i]);

        }

        char[] c = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i < c.length; i++) {
            System.out.println((char)c[i]+32);

        }
    }
}
