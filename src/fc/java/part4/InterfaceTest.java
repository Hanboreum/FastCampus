package fc.java.part4;

import fc.java.poly.Radio;
import fc.java.poly.RemoCon;
import fc.java.poly.Tv;

public class InterfaceTest {
    public static void main(String[] args) {
        // 리모콘으로 라디오와 티비를 동작시키자. 업캐스팅
        // 다형성이 100% 보장된다.
        //부모가 인터페이스면 자식의 내부 동작 방식을 전혀 몰라도 동작시킬 수 있다.
        RemoCon remo = new Radio();
        
        remo.chDown();
        remo.volDown();
        remo.internet(); //오동작

        remo = new Tv();
        remo.chUp();
        remo.volDown();
        remo.internet();
    }
}
