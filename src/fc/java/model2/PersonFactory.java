package fc.java.model2;

@FunctionalInterface //함수인터페이스
public interface PersonFactory {
    public Person create(String name, int age);
}
