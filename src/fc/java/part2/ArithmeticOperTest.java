package fc.java.part2;

public class ArithmeticOperTest {
    public static void main(String[] args) {
        int digit  =3625;
        System.out.println(digit %10); //5
        System.out.println(digit / 10 %10); //10의 자리수 2
        System.out.println(digit/100 %10);//100의 자리수 6
        System.out.println(digit/1000%10); //1000자리수 3

        System.out.println();
        int num = 2579;
        System.out.println(num%10);
        System.out.println(num/10%10);
        System.out.println(num/100 %10);
        System.out.println(num/1000%10);

        int odd=3;
        if(odd%2==0){
            System.out.println("짝수");
        }else{
            System.out.println("홀");
        }
        

    }
}
