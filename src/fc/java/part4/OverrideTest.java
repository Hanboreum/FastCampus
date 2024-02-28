package fc.java.part4;

import fc.java.model.*;

public class OverrideTest {
    public static void main(String[] args) {
        Animal ani = new Dog(); //upcasting
        //왜?하지: dog의 class파일만 있을 시, dog를 가지고 구동하기엔 무리
        // animal이라는 클래스가 dog와 상속관계일때,
        ani.eat(); //컴파일전 animal의 것, 실행 시 Dog의 것이 됨 -> 동적바인딩
        //Animal an1 = new Cat(); 부모는 하나이기 때문에 안 함
        ani =new Cat();
        ani.eat();

    }
}
