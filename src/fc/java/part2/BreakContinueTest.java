package fc.java.part2;

public class BreakContinueTest {
    public static void main(String[] args) {
        //char배열에 shoutdown 출력 중 o 만나면 중지

        char[] c ={'s','h','u','t','d','o','w','n'};
        for(int i=0; i<c.length; i++){
            if(c[i]=='o')
                break;
            System.out.println(c[i]);
        }
        //1-10 중 3의 배수의 개수
        int count = 0;
        for(int i=1; i<=10; i++){
            if(i%3!=0) continue;
                count++;
        }
        System.out.println(count);
    }
}
