package fc.java.part3;

import fc.java.model.PersonVO;

public class ToStringPrint {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("namename",11,"010----");
        System.out.println(vo.getName()+vo.getPhone()+vo.getAge());
        System.out.println(vo.toString());
        System.out.println(vo);

    }
}
