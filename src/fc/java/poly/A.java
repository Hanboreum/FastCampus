package fc.java.poly;

public class A extends Object{
    public A(){
        super();
    }
    public void display(){
        System.out.println("A. ");
    }

    public void printGO(){
        System.out.println("print go: A. ");
    }
}
//생략되어있는 것들을 추가 함.
//extends obj, public a super()
//결국은 전체가 a의 것.
//부모, 자식 뭘로 가리킬건지, 부모는 업캐스팅해야 다 가리킬 수 잇ㄷ.
