package fc.java.part2;

public class CharTest {
    public static void main(String[] args) {
        int sum = 0;
        sum = sum+1;
        char c= 'A';
        System.out.println(c);
        int a= 'A';
        System.out.println("a = " + a);
        
        int hanU = '\uAC00';
        System.out.println("hanU = " + hanU);
        System.out.println("(char)hanU = " + (char)hanU);

        //대 ->소
        char upper ='S';
        char lower =(char)(upper+32);
        System.out.println("lower = " + lower);

        //소  -> 대
        char lower1 = 'a';
        int upper1 = lower1 -31;
        System.out.println("upper1 = " + upper1);
        System.out.println("upper1 = " + (char)upper1); //문자값으로 출력

        //'1'+'2'=3이 나오도록 프로그래밍
        int data = '1'+'2';
        System.out.println("data = " + data); //99. 아스키코드 사용
        //'0'=48
        char i ='1'; //49-48
        char j= '2'; //50-49
        int sum1 =(i-48)+(j-48);
        System.out.println("sum = " + sum1);

    }
}
