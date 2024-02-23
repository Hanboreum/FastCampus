package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        //생성자 메서드 통헤 원하는 값 전달하고 toString통해 출력
        PersonVO vo = new PersonVO("TSP",11,"9=9-9-");
        System.out.println(vo.toString());
    }
}
