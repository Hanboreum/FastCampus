package fc.java.part2;

public class ArrayMake {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int[] b = new int[5];

       for( int x=0; x < b.length; x++){
           b[x] = 10;
            System.out.println(b[x]);
        }

        float f[] = new float[5]; //길이고정

        Book b1,b2,b3;
        Book[] c= new Book[3];

        for (int i=0; i<a.length; i ++){
            System.out.println(a[i]);
        }
    }
}
