package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        //setter,getter메서드를 통해 PersonVO 객체에 이룸, 나이, 전화번호를 저장하고 출력
       PersonVO vo = new PersonVO();
        vo.setName("name");
        vo.setAge(55);
        vo.setPhone("0-0-0-0-0-0");

        System.out.println(vo.getAge()+"\t"+vo.getName()+"\t"+vo.getPhone());
    }
}
