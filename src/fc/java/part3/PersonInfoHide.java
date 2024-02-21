package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        //한사람의 회원 정보를 저장할 객체를 생성
        PersonVO vo = new PersonVO();
        vo.name = "NAME";
        vo.phone="0101234-234";
        vo.age=11;
        System.out.println(vo.age+"\t"+vo.name);

    }
}
