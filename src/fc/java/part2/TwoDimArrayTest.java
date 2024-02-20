package fc.java.part2;

public class TwoDimArrayTest {
    public static void main(String[] args) {
        //2행 4열의 정수형 배열 생성
        int[][] a = new int[2][4];
        a[0][0] =10;
        a[0][2]=20;
        a[1][0]=2;
        System.out.println(a[0][0]);
        System.out.println(a[1][0]);
    }
}
