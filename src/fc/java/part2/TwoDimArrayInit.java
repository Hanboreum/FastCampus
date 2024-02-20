package fc.java.part2;

public class TwoDimArrayInit {
    public static void main(String[] args) {
        //2차원 배열 초기화, 2행 4열 초기화 완
        int[][]a = {{1,2,3,4},{5,6,7,8}};

        for(int i=0; i<=a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        //가변길이
        int[][] b= new int[3][];
        b[0] =new int[1]; //1행은 1열
        b[1] =new int[2];
        b[2] =new int[3];

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j]='*';
                System.out.print(b[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
