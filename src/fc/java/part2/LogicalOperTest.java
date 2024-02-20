package fc.java.part2;

public class LogicalOperTest {
    public static void main(String[] args) {
        //논리 연산자ㅡ이 결과
        int x=1, y=0;
        System.out.println(!(x>0)); //!1>0  ==t =f
        System.out.println(x>0 && x<3); //1>0 and 1<3 t
        System.out.println(x>0 && y<0);// 1>0 and 1<0 f
        System.out.println(x<0 || y>0);//1<0 OR 0>0 f
        System.out.println(y< 0 && y<-5);// 0<0 or 0< -5 f

        System.out.println();
        int a=3, b=5;
        System.out.println((a>=3)&& (b<6)); //3>=3 and 5<6 t
        System.out.println((a!=3) &&(a>2)); //3!=3 and 3>2 /f
    }
}
