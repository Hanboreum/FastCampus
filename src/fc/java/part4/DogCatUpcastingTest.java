package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatUpcastingTest {
    public static void main(String[] args) {
        //dog 객체 사용

        Animal ani = new Dog();
        //upcasting
        //부모가 자식을 가리키는 경우
        ani.eat();  //동물: 먹다. -> 개: 먹다 로 바꾸고싶다

        ani = new Cat();
        ani.eat(); //
    }
}
