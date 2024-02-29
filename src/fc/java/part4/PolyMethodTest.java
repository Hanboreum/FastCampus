package fc.java.part4;

import fc.java.model.Cat;
import fc.java.model.Dog;


public class PolyMethodTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        display(d);

    }
    public  static void display(Dog d){
        System.out.println("dog: eat");
    }
}
