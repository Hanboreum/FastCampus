package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        char[] c={'d','f','t','y'};
        for(int i=0; i<c.length; i++){
            if(c[i]=='t')break;
            System.out.println(c[i]);
        }
        int count = 0;
        for(int i=1; i<=10; i++){
            if(i%3==0) count++;
        }
        System.out.println(count);
    }
}
