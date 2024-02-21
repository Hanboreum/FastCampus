package fc.java.part3;

public class PersonAccessTest {
    public static void main(String[] args) {
        //person클래스에 이름 나이 전호번호를 저장하고 출력하라
       Person p =new Person();
       p.name="hanBR";
       p.age=1; //1은 안되지 하지만 가능하다. public 이기 때문에 제약없이 접근 가능
       p.phone="01000001111";
        System.out.println(p.age+ "\t"+p.name+"\t"+p.phone);

    }
}
