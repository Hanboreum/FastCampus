package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

import java.lang.reflect.Array;

public class PolyArrayTest {
    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c = new Cat();
        //dog, cat을 저장할 배열 생성
        //Animal [] ani = {new Dog(), new Cat()};
        //위와같이 생성과 동시에 초기화 가능
        //다형성배열
        Animal[] ani = new Animal[2];
        ani[0] =d;
        ani[1] =c;
        display(ani);

    }
    public static void display(Animal[]ani){ //다형성 인수
        for( int i=0; i<ani.length; i++){
            ani[i].eat();
            if(ani[i] instanceof Cat){
                ((Cat)ani[i]).night();
            }
        }
    }
}
