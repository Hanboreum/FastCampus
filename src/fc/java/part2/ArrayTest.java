package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        //float f1,f2,f3,f4;
        // 실수 5개를 저장할 배열을 생성하고 모든원소에 10 저장 출력
        float[] f = new float[5];
        f[0] = 10.5f;
        f[1] = 11.5f;
        f[2] = 12.5f;
        f[3] = 13.5f;
        f[4] = 14.5f;
        for (int i = 0; i < f.length; i++) {
            System.out.println(f[i]);

        }

        //정수 5개를 배열 초기화하고 index 0번,3 번째 값을 더헤 출력
        int a[] = {1,2,3,4,5};
        System.out.println(a[0] + a[3]);

    }
}
