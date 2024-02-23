package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorInit {
    public static void main(String[] args) {
        //constructor생성자 메서드를 통해 personvo객체에 이름나이 전화전화 저장 출력
        PersonVO vo = new PersonVO();
        System.out.println(vo.getAge()+"\t"+vo.getName()+"\t"+vo.getPhone());

        PersonVO vo1 = new PersonVO();
        System.out.println(vo1.getAge()+"\t"+vo1.getName()+"\t"+vo1.getPhone());

        //원하는 값으로 초기화 하는 방법?
    }
}
