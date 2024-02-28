package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyTest {
    public static void main(String[] args) {
        //다형성 하려면 업캐스팅으로 객체 생성
        //클래스가 상속관계여야 함,재정의가 되어 있어야 함, 동적 바인딩이 일어나야 자식 찾아감
        // 다형성 polymorphism :상위 클래스가 동일한 메세지로 하위 클래스를 서로 다르게 동작 시키는 것
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
        ((Cat)ani).night();
        //Cat c = (Cat)ani;


    }
}
