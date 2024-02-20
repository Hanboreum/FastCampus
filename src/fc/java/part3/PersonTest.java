package fc.java.part3;

public class PersonTest {
    public static void main(String[] args) {
        //한사람의 데이터를 저장할 변수를 선언
        //2.모델링된 person 클래스를 이용해 [객체를 메모리에 생성]
        // 인스턴스를 만드는 과정 new Person() -> 매모리의 실체가 만들어지고
        //Person p <-실체가 저장됨
        Person p = new Person();
        p.name ="name1";
        p.age =1;
        p.phone="010-000-000-00";
        System.out.println(p.age + p.name +p.phone);
        p.play();
        p.eat();
        p.walk();

        Person p2 = new Person();
        p2.name ="2name1";
        p2.age =12;
        p2.phone="210-000-000-00";
        System.out.println(p2.age + p2.name +p2.phone);

    }
}
