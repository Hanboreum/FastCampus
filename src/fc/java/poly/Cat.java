package fc.java.poly;

import fc.java.model.Animal;

public class Cat extends Animal {
    public void night(){
        System.out.println("Zzz");
    }
    //재정의 eat 안하기
    public void eat(){
        System.out.println("cat: eat");
    }
}
