package fc.java.part2;

public class CastingTest {
    public static void main(String[] args) {
        float f1 = .20f;
        System.out.println("f1 = " + f1);
        float f2 = 15f;
        System.out.println("f2 = " + f2);
        float f3 = 3.14f;
        System.out.println("f3 = " + f3);
        double d1 = 123.455;
        System.out.println("d1 = " + d1);

        float x = 12.5f;
        int y = (int)x; //강제형변환
        System.out.println("y = " + y);

        char a = 'a';
        int cc = a;

        int d = 5;
        double dd = d;
        System.out.println("dd = " + dd);

        double dx = 12.34;
        int dy = (int)dx;

    }
}
