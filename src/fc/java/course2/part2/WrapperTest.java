package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        // int a = 10; 기본 자료형
        //Integer a = new Integer(10); //사용자 자료형, 객체라 new 사용
        Integer a =10; //이것도 가능하다. auto boxing
        System.out.println(a.intValue()); //unboxing

        Integer b = 20; //integer로 들어갈 떈 포장auto boxing
        int bb =b; //auto unboxing 포장 해제

        float f = 23.3f;
        Float f2 = 44.4f; //new Float(); 이것을 auto boxing
        System.out.println(f2.floatValue());

        Float f3 = 33.3f;
        float f4 = f3; // f3.floatValue() 내부에서 발생 -> auto boxing
        System.out.println(f4);
        System.out.println(f3.floatValue());
    }
}
