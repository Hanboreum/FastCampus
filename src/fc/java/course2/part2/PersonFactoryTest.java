package fc.java.course2.part2;

import fc.java.model2.Person;
import fc.java.model2.PersonFactory;

public class PersonFactoryTest {
    public static void main(String[] args) {
       /* PersonFactory personFactory = Person::new; //생성자참조
        Person person = personFactory.create("name",1);
        System.out.println(person);*/

        //바로 참조, 익명 내부 클래스
        PersonFactory personFactory = new PersonFactory() {
            @Override
            public Person create(String name, int age) {
                return new Person(name, age);
            }
        };

        Person person = personFactory.create("namename",3);
        System.out.println(person);
    }
}
