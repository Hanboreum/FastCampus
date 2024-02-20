package fc.java.part2;

public class LoopLoopTest {
    public static void main(String[] args) {
        int index =1;
       for(int i=0; i<=9; i++){
           for(int j=0; j<=i; j++){
               int sum = i*j;
               System.out.println(i+"x"+j+"="+sum);
               System.out.println(index);
               index++;
           }// j
       } //i

        int[][]arr ={{1,2,3,4,5},{1,2,3,4,5}};

       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr[i].length; j++){

               System.out.print(arr[i][j]+"\t");
           }
           System.out.println();

       }

    }
}
