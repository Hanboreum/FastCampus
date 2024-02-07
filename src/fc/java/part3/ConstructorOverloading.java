package fc.java.part3;

import fc.java.model.PersonVO;

public class ConstructorOverloading {
    public static void main(String[] args) {
        PersonVO vo = new PersonVO("name1",44,"010-");
        PersonVO vo1 = new PersonVO("name2",60,"010-222");
        PersonVO vo2 = new PersonVO("name3",40,"010-333");

        System.out.println(vo.getName()+"\t"+vo1.getName()+"\t"+vo2.getName());


    }
}
