package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        //한사람의 회원 정보를 저장할 객체를 생성
        PersonVO vo = new PersonVO();
        vo.setName("name");
        vo.setPhone("010-00-00-00");
        // vo.age=11;
        vo.setAge(44);
        System.out.println(vo.getAge()+"\t"+vo.getName()+"\t"+vo.getPhone());

    }
}
