package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO(); //namename나옴
        PersonVO vo1 = new PersonVO("name1",33,"-0-0-0-0-");
        PersonVO vo2 = new PersonVO("22name",22,"9=9=9");
        System.out.println(vo.getName()+"\t"+vo.getName()+"\t"+vo.getName());
        System.out.println(vo2.getName()+"\t"+vo2.getName()+"\t"+vo2.getName());


    }
}
