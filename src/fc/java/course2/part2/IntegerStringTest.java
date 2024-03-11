package fc.java.course2.part2;

public class IntegerStringTest {
    public static void main(String[] args) {
        String str ="123";
        String str2 = "123";
        System.out.println(str+str2); //123123 덧셈이 아니라 결합
        int num = Integer.parseInt(str) +Integer.parseInt(str2);
        System.out.println(num);

        int su = 123;
        int su2 = 123;
        //su1+su2 = 246
        System.out.println(su+ su2);

        String sum= String.valueOf(su) +String.valueOf(su2);
        System.out.println(sum);
        String sum2 = su+""+su;
        System.out.println(sum2);
    }
}
