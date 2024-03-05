package fc.java.part4;

import fc.java.poly.Animal;
import fc.java.poly.Cat;
import fc.java.poly.Dog;

public class AbstractClassTest {
    public static void main(String[] args) {
        //추상클래스는 단독으로 객체를 생성할 수 없다.
        //Animal ani = new Animal();
        Animal ani = new Dog();
        ani.eat(); //dog의 eat출력
        ani.move();

        ani = new Cat();
        ani.eat();
        ani.move();
        ((Cat)ani).night();
    }
}
