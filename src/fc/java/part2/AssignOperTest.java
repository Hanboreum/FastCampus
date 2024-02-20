package fc.java.part2;

public class AssignOperTest {
    public static void main(String[] args) {
        int a= 1;
        //복합대입연산자
        //1씩 증가하는 수식
        a++;
        ++a;
        a+=1;
        a= a+1;
        System.out.println("a = " + a);

        int b=7;
        --b;
        b--;
        b-=1;
        b = b-1;
        System.out.println("b = " + b);

    }
}
