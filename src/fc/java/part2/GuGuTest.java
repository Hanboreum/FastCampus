package fc.java.part2;

public class GuGuTest {
    public static void main(String[] args) {
        //9x9
        for(int i=2; i<=9; i++){
            System.out.print(i+"\t\t");
        }
        System.out.println();
        //2x2, 3x1
        for(int i=1;i<=9;i++){
            for(int j=2; j<=9; j++){
                System.out.print(j+"x"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }

    }
}
