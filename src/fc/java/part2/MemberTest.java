package fc.java.part2;

public class MemberTest {
    public static void main(String[] args) {
        Member m = new Member();
        m.name="name1";
        m.weight=12.3f;
        m.tel=01001010;
        m.age =1;
        m.address="dong";
        m.mail="@naver.com";
        System.out.println(m.address+m.name+m.tel);
    }

}
