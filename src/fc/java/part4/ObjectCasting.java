package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class ObjectCasting {
    public static void main(String[] args) {
        Animal ani =new Dog();
        ani.eat(); //dog
        ani = new Cat(); //upcasting
        ani.eat();//eat
        //ani.night(); donwcasting해야 사용

        Cat c =(Cat)ani;// downcasting
        //ani타입을 cat타입으로 바꿔 cat타입으로 바꿀 수 있다
        //((Cat)ani).night();  이렇게도 가능하다
        c.night();
    }
}
