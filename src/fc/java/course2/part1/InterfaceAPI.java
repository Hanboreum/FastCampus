package fc.java.course2.part1;

import fc.java.model2.BB;
import fc.java.model2.CC;

//cc interface ->bb class 동작
public class InterfaceAPI {
    public static void main(String[] args) {
        CC c = new BB();
        c.x();
        c.z();//동적 바인딩이 일어나 BB의 z를 구동한다./ 재정의가 되어있기 때문에

    }
}
