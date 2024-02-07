package fc.java.part3;

import fc.java.model.PersonVO;

public class PersonInfoHide {
    public static void main(String[] args) {
        //한사람의 회원 정보를 저장할 객체를 생성
        PersonVO vo = new PersonVO();
       // vo.age = 11; //정보은닉이 안됨
        //vo.name ="Lee";
        //vo.phone="010-555-4444";
        //System.out.println(vo.age+"\t"+vo.name+"\t"+vo.phone);

        vo.setPhone("010-0108--");
        vo.setAge(2020);
        vo.setName("nameLee");
        System.out.println(vo.getAge() +"\t"+vo.getPhone());
    }
}
