package fc.java.part2;

public class ArrayTest {
    public static void main(String[] args) {
        //float f1,f2,f3,f4;
        // 실수 5개를 저장할 배열을 생성하고 모든원소에 10 저장 출력
       float arr [] = new float[5];
       for(int i=0; i<arr.length; i++){
           arr[i] += 10;
           System.out.println(arr[i]);
       }
        //정수 5개를 배열 초기화하고 index 0번,3 번째 값을 더헤 출력

        int a[] = {1,23,4,5};
       for(int i=0; i<a.length; i++){
           System.out.println(a[i]);
       }
       int sum =a[0] +a[3];
        System.out.println(sum);
        System.out.println(a.length);
    }
}
