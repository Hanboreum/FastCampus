package fc.java.model;

public class Dog extends Animal{
    public Dog(){
        super();
    }
    public void eat(){ //override,재정의
        System.out.println("dog: eat");
    }
}
