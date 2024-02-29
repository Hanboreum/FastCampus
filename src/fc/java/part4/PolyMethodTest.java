package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;


public class PolyMethodTest {
    public static void main(String[] args) {
        Animal ani = new Dog();
        display(ani);
         ani = new Cat();
         display(ani);

    }
    public static void display(Animal ani){
        ani.eat();
        if(ani instanceof Cat){
            Cat c= (Cat) ani;
            c.night();

            ((Cat)ani).night();
        }
    }
}
