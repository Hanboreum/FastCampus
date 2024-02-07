package fc.java.part2;

public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.name="name";
        m.age = 21;
        m.tel=1234;
        m.email = "fd@naver.com";
        m.addr = "seoul";
        m.weight= 23.4f;
        System.out.println("m = " + m);
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.tel);
        System.out.println(m.email);
        System.out.println(m);
    }

}
