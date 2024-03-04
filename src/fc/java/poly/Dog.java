package fc.java.poly;

import fc.java.model.Animal;

public class Dog extends Animal {
    // 재정의 없을 땐 eat는 ? 인 상태.
    public void eat(){
        System.out.println("dog:eat");
    }

}
