package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args) {
        int index =1;
        for(int i=0; i <5; i++){
            for(int j=0; j<5; j++){
                System.out.println(index);
                index ++;
            } //j
        } //i
        int[][] a= {{1,2,3,4,5},{3,4,5,6,7}};

        for(int i=0; i<2; i++){
            for(int j=0; j<5; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
