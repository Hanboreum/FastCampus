package fc.java.poly;


//abstract 추상 클래스
public abstract class Animal {
    public abstract void eat();// 추상메서드라고 한다. 불완전 메서드
    //:메서드의 구현부가 없다. 자식이 반드시 재정의
    //재정의하면 ? 안나옴, 자식을 찾아가는 통로 역할
    public void move(){ //추상 클래스엔 정의된 메서드도 온다.
        System.out.println("animal: move");
        //바디가 있는 구현 메서드
    }
}
