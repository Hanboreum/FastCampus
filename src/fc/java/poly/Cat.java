package fc.java.poly;

import fc.java.poly.*;

public class Cat extends Animal {
    public void night(){
        System.out.println("Zzz");
    }

    @Override
    public void eat() {
        System.out.println("cat: eat");
    }
    //재정의 eat 안하기

}
