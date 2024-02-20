package fc.java.part2;

public class ArrayMake {
    public static void main(String[] args) {
        int[] a= new int[5]; //정수 5개를 저장할 배열 생성
        float[] f = new float[10];

        Book b1,b2,b3;
        Book[] b = new Book[3]; //객체배열

        for (int i=0; i< a.length; i++){
            a[i] +=10;
            System.out.println(a[i]);
        }

        int arr[] = new int[]{1,2,3,4,5};


    }

}
