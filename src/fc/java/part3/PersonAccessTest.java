package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        //person클래스에 이름 나이 전호번호를 저장하고 출력하라
        Person p = new Person();
        p.name ="Lee";
        p.age = 100;
        p.phone = "0100000000";
        System.out.println(p.name+"\t"+p.age);
    }
}
