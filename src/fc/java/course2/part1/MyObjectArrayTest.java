package fc.java.course2.part1;

import fc.java.model2.*;
import fc.java.model2.ObjectArray;

public class MyObjectArrayTest {
    public static void main(String[] args) {
        //abc객체 배열에(다형성배열. object사용) 저장, 출력
        //Book, movie, member 또한 Object를 사용하면 됨
        ObjectArray list = new ObjectArray(20);
        //크기지정은 어떻게?, 오버로딩함

        list.add(new A());// 업캐스팅 Object element = new A()
        list.add(new B());
        list.add(new C()); //다형성인수 이므로 c로 받기 가능

       // A a = list.get(0); 이렇게 바로 get해서 받아 올 수 없다.
        A a = (A)list.get(0); //다운캐스팅을 해 get해온다.
        a.display();

        B b = (B)list.get(1); // B<=object
        b.display();

        C c = (C)list.get(2);
        c.display();
// 또한 for문을 돌려 출력할 수 있다. 하지만 다운캐스팅을 A?B?C?뭐로 할 지 모른다.
  //instaceof로 형 비교
        for(int i=0; i< list.size(); i++){
           if( list.get(i) instanceof A){
               ((A)list.get(i)).display();
           }else if(list.get(i) instanceof B){
               ((B)list.get(i)).display();
           }else{
               ((C)list.get(i)).display();
           }
        }
    }
}
