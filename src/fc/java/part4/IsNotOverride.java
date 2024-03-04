package fc.java.part4;

import fc.java.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
        //재정의를 안 해 부모가 명령을 내리면 오작동 함
        //다형성을 보장하지 않았다. -> 재정의를 강제로 하게 만들어준다
        //추상클래스, 인터페이스 등장
       Animal ani = new Dog();

    }
}
